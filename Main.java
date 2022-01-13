import Devices.Device;
import Event.DoingSomething;
import Event.EventKitchen;
import Event.EventLivingRoom;
import Event.Temperature;
import LivingBeing.Human;
import Maker.*;

import java.util.ArrayList;
import java.util.List;
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
        int Animals_Count = 5;
        Area home = make.newHome(Rooms_Count, Humans_Count, Animals_Count);
        HumanMaker hm = new HumanMaker();
        for (House f : home.getArea()){
           // f.addHuman(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
            for (Room r : f.getRooms()){
                for(Device d : r.getDevices()){
                    d.addUsers(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
                }
            }
        }
        ArrayList<String> events = new ArrayList<>();
        ArrayList<String> rooms = new ArrayList<>();
        Temperature tem = new Temperature();
        DoingSomething doing = new DoingSomething();
        EventKitchen ek = new EventKitchen();
        EventLivingRoom el = new EventLivingRoom();

        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                System.out.println(r.getHumans());
                if((r.getHumans()).size() == 1){
                    if(temperature.equals("HOT")){
                        tem.DoColder();
                        events.add("HotTemperature");
                    }
                    else{
                        tem.DoHotter();
                        events.add("ColdTemperature");
                    }
                    if(9<clock && clock<18) {
                        if (r.getName().equals("Kitchen")) {
                            ek.Eating();
                            events.add("Eating");
                        } else {
                            el.Chilling();
                            events.add("Chilling");
                        }
                        rooms.add(r.getName());
                    }else{
                        doing.Night();
                        events.add("Night");
                    }
                }
            }
            for(TransportRoom tr: h.getTrRooms()){
                System.out.println(tr.getHumans());
                for(int i=0; i<tr.getHuman_Counter(); i++){
                    events.add("DO SPORT");
                }
            }
        }

        System.out.println("Report about Events "+events);

//        Make house + take DATETIME
//        DO Event
    }
}