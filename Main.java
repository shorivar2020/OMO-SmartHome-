import Devices.Device;
import Event.HouseAI;
import Event.EventKitchen;
import Event.EventLivingRoom;
import LivingBeing.Human;
import Maker.*;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;
import Transport.Transport;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        AreaMaker make = new AreaMaker();
        int clock;
        String temperature;
        switch (rand.nextInt(3)) {
            case 0:
                clock = 12;
                temperature = "HOT";
                break;
            case 1:
                clock = 0;
                temperature = "HOT";
                break;
            case 2:
                clock = 12;
                temperature = "COLD";
                break;
            case 3:
                clock = 0;
                temperature = "COLD";
                break;
            default:
                clock = 0;
                temperature = "";
        }
        int Humans_Count = 6;
        int Rooms_Count = 6;
        int Animals_Count = 3;
        int Ski_count = 1;
        int Bicycle_count = 1;
        int Car_count = 1;
        Area home = make.newHome(Rooms_Count, Humans_Count, Animals_Count, Ski_count, Bicycle_count, Car_count);
        //HumanMaker hm = new HumanMaker();
        //NOT NEED

        ////////////////////////////////////////////
        //Events
        ArrayList<String> events = new ArrayList<>();
        ArrayList<String> rooms = new ArrayList<>();
        HouseAI doing = new HouseAI();
        EventKitchen ek = new EventKitchen();
        EventLivingRoom el = new EventLivingRoom();

        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                //System.out.println(r.getHumans());
                if((r.getHumans()).size() == 1){
                    if(temperature.equals("HOT")){
                        doing.DoColder(r);
                        events.add("HotTemperature");
                    }
                    else{
                        doing.DoHotter(r);
                        events.add("ColdTemperature");
                    }
                    if(9<clock && clock<18) {
                        doing.Day(r.getHumans(), r);
                        if (r.getName().equals("Kitchen")) {
                            ek.Eating(r.getHumans(), r);
                            events.add("Eating");
                        } else {
                            el.Chilling(r.getHumans(), r);
                            events.add("Chilling");
                        }
                        rooms.add(r.getName());
                    }else{
                        doing.Night(r.getHumans(), r);
                        events.add("Night");
                    }
                }
            }
            int count_wait = 0;
            for(Parking tr: h.getTrRooms()){
                //System.out.println(tr.getHumans());
                if(tr.getTransport_Counter()< tr.getHuman_Counter()){
                    count_wait = tr.getTransport_Counter() - tr.getHuman_Counter();
                }
                //for(int i=0; i<tr.getHuman_Counter(); i++){
                //events.add("DO SPORT");
                //for(Human human: tr.getHumans()){
                int count_tr = 0;
                for(Ski s: tr.getSkis()){
                    //System.out.println(s);
                    tr.getHumans().get(count_tr).setUseTransport(s);
                    events.add("Ski");
                    count_tr +=1;
                }
                for (Bicycle b: tr.getBicycles()){
                    //System.out.println(b);
                    tr.getHumans().get(count_tr).setUseTransport(b);
                    events.add("Bicycle");
                    count_tr +=1;
                }
                for (Car c: tr.getCars()){
                    //System.out.println("CARS" + tr.getCars().size());
                    //for (int car=0; car<tr.getCars().size(); car++){
                    //System.out.println(c);
                    tr.getHumans().get(count_tr).setUseTransport(c);
                    count_tr +=1;
                    //human.setUseTransport(tr.getCars().get(i));
                    events.add("Car");
                }
                for(int w=0; w<count_wait; w++){
                    tr.getHumans().get(count_tr).Waiting();
                    events.add("Wait");
                }

                //}
                // }
            }
        }
        FileWriter writer = new FileWriter("ConsumptionReport.txt", false);
        int totalElectricity = 0;
        int totalWater = 0;
        int totalMoney = 0;
        for(House h: home.getArea()){
            for (Room r: h.getRooms()){
                for(Device d: ((RoomHouse) r).getDevices()){
                    writer.write(" -" + String.valueOf(d));
                    writer.write("| Electricity:" + d.getElectricity());
                    writer.write("| Water:" + d.getWater());
                    writer.write("| Money:" + d.getMoney());
                    writer.append("\n");
                    totalElectricity += d.getElectricity();
                    totalWater += d.getWater();
                    totalMoney += d.getMoney();
                }
            }
        }
        writer.append("\n");
        writer.write("totalElectricity: " + totalElectricity);
        writer.write("| totalWater: " + totalWater);
        writer.write("| TotalMoney: " + totalMoney);
        //writer.write(totalElectricity);
        //writer.append('\n');
        //writer.write(totalWater);
        //writer.append('\n');
        //writer.write(totalMoney);
        //writer.write("Report about Events "+events);
        writer.flush();
        FileWriter writHome = new FileWriter("HouseConfigurationReport.txt", false);
        FileWriter writDevices = new FileWriter("HouseConfigurationReportDevice.txt", false);
        writHome.write("| Home: " + home);
        writHome.append('\n');
        writHome.write("| Area: " + home.getArea());
        writHome.append('\n');
        int i=0;
        for (House f : home.getArea()){
            writHome.write("| House:" + f);
            writHome.append('\n');
            writHome.write("| Transport room:" + f.getTrRooms());
            writHome.append('\n');
            writHome.write("| Rooms: " + f.getRooms());
            writHome.append('\n');
            //System.out.println(home.getArea());
            // f.addHuman(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
            for (Room r : f.getRooms()){
                writHome.write("| Room: " + r);
                writHome.append('\n');
                writHome.write("| Type: " + r.getName());
                writHome.append('\n');
                writHome.write("| Devices: " + ((RoomHouse) r).getDevices());
                writHome.append('\n');
                writHome.write("| Humans: " + r.getHumans());
                writHome.append('\n');
                for(Device d : ((RoomHouse) r).getDevices()){
                    i++;
                    writDevices.write("| Device: " + d);
                    writDevices.append('\n');
                    writDevices.write("| Type: " + d.getDeviceName());
                    writDevices.append('\n');
                    if(d.getUsers().contains(null)){
                        writDevices.write("| Users: AI HOME");
                    }
                    else{
                        writDevices.write("| Users: " + d.getUsers());
                    }

                    //writDevices.write("| Users: " + d.getUsers().get(i).getName());
                    //writDevices.write(d.getHomeAI().get(0));
                    writDevices.append('\n');
                    writDevices.write(" | Electricity: " + d.getElectricity());
                    writDevices.append('\n');
                    writDevices.write("| Water: " + d.getWater());
                    writDevices.append('\n');
                    writDevices.write("| Money: " + d.getMoney());
                    writDevices.append('\n');
                    //d.addUsers(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
                    //System.out.println("Users"+ d.getUsers());

                }
            }
        }
        writDevices.flush();
        writHome.flush();
//        System.out.println(totalElectricity);
//        System.out.println(totalWater);
        //      System.out.println(totalMoney);
        System.out.println("Report about Events "+events);
//        for(Human p: r.getHumans()){
//            human.write("| Human: " + p);
//            human.append('\n');
//                    human.write("| Device: " + p.getUse());
//                    human.append('\n');
//                    human.write("| Do: " + p.getDoings());
//                    human.append('\n');
//                    human.write("| Animal: " + p.getWithAnimal());
//                    human.append('\n');
//                    human.write("| Transport: " + p.getUseTransport());
//                    human.append('\n');
        FileWriter writHuman = new FileWriter("ActivityAndUsageReport.txt", false);
        for(House h: home.getArea()){
            for (Room r: h.getRooms()){
                for(Human p:r.getHumans()){
                    writHuman.write(String.valueOf(p));
                    writHuman.append('\n');
                    writHuman.write("Transport:" + String.valueOf(p.getUseTransport()));
                    writHuman.append('\n');
                    writHuman.write("Devices:" + String.valueOf(p.getUse()));
                    writHuman.append('\n');
                    writHuman.write("Do:" + String.valueOf(p.getDoings()));
                    writHuman.append('\n');
                    writHuman.write("Animal:" + String.valueOf(p.getWithAnimal()));
                    writHuman.append('\n');
                }
            }
            for(Parking t: h.getTrRooms()){
                for(Human p: t.getHumans()){
                    writHuman.write(String.valueOf(p));
                    writHuman.append('\n');
                    writHuman.write("Transport:" + String.valueOf(p.getUseTransport()));
                    writHuman.append('\n');
                    writHuman.write("Devices:" + String.valueOf(p.getUse()));
                    writHuman.append('\n');
                    writHuman.write("Do:" + String.valueOf(p.getDoings()));
                    writHuman.append('\n');
                    writHuman.write("Animal:" + String.valueOf(p.getWithAnimal()));
                    writHuman.append('\n');
                }
            }
        }
        writHuman.flush();
    }
}
