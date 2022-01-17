import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;
import Maker.Area;
import Maker.House;
import Maker.Parking;
import Maker.Room;

import java.io.FileWriter;
import java.io.IOException;

public class Report {
    public void report(Area home) throws IOException {
        FileWriter writer = new FileWriter("ConsumptionReport.txt", false);
        int totalElectricity = 0;
        int totalWater = 0;
        int totalMoney = 0;
        for(House h: home.getArea()){
            for (Room r: h.getRooms()){
                for(Device d: r.getDevices()){
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
                writHome.write("| Devices: " + r.getDevices());
                writHome.append('\n');
                writHome.write("| Humans: " + r.getHumans());
                writHome.append('\n');
                for(Device d : r.getDevices()){
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
        System.out.println(totalElectricity);
        System.out.println(totalWater);
        //      System.out.println(totalMoney);
//        FileWriter human = new FileWriter("ActivityAndUsageReport.txt", false);
//        System.out.println("Report about Events "+events);
//        for(Human p: r.getHumans()){
//            human.write("| Human: " + p);
//            human.append('\n');
//            human.write("| Device: " + p.getUse());
//            human.append('\n');
//            human.write("| Do: " + p.getDoings());
//            human.append('\n');
//            human.write("| Animal: " + p.getWithAnimal());
//            human.append('\n');
//            human.write("| Transport: " + p.getUseTransport());
//            human.append('\n');
        FileWriter writHuman = new FileWriter("ActivityAndUsageReport.txt", false);
        for(House h: home.getArea()) {
            for (Room r : h.getRooms()) {
                for (Human p : r.getHumans()) {
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
                for (Animal a: r.getAnimals()){
                    writHuman.write(String.valueOf(a));
                    writHuman.append('\n');
                    writHuman.write("Humans:" + String.valueOf(a.getWithHuman()));
                    writHuman.append('\n');
                }
            }
            for (Parking t : h.getTrRooms()) {
                for (Human p : t.getHumans()) {
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
            writHuman.flush();
        }
    }
}
