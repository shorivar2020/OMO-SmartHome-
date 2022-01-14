import Devices.Device;
import Event.HouseAI;
import Event.EventKitchen;
import Event.EventLivingRoom;
import LivingBeing.Human;
import Maker.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
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
//        for (House f : home.getArea()){
//           // f.addHuman(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
//            for (Room r : f.getRooms()){
//                for(Device d : r.getDevices()){
//                    d.addUsers(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
//                }
//            }
//        }
        ////////////////////////////////////////////
        //Events
        ArrayList<String> events = new ArrayList<>();
        ArrayList<String> rooms = new ArrayList<>();
        HouseAI doing = new HouseAI();
        EventKitchen ek = new EventKitchen();
        EventLivingRoom el = new EventLivingRoom();

        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                System.out.println(r.getHumans());
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
                        if (r.getName().equals("Kitchen")) {
                            ek.Eating(r.getHumans(), r);
                            events.add("Eating");
                        } else {
                            el.Chilling(r.getHumans(), r);
                            events.add("Chilling");
                        }
                        rooms.add(r.getName());
                    }else{
                        doing.Night(r);
                        events.add("Night");
                    }
                }
            }
            for(Parking tr: h.getTrRooms()){
                System.out.println(tr.getHumans());
                for(int i=0; i<tr.getHuman_Counter(); i++){
                    events.add("DO SPORT");
                }
            }
        }
        int totalElectricity = 0;
        int totalWater = 0;
        int totalMoney = 0;
        for(House h: home.getArea()){
            for (Room r: h.getRooms()){
                for(Device d: r.getDevices()){
                    totalElectricity += d.getElectricity();
                    totalWater += d.getWater();
                    totalMoney += d.getMoney();
                }
            }
        }
        System.out.println(totalElectricity);
        System.out.println(totalWater);
        System.out.println(totalMoney);
        System.out.println("Report about Events "+events);
    }
}