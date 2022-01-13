import API.DATETIME;
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
        AreaMaker make = new AreaMaker();
        int Humans_Count = 6;
        Area home = make.newHome(6, Humans_Count, 5);
        HumanMaker hm = new HumanMaker();
        //hm.setFather(home.getArea().get(0).getRooms().get(0).getHumans().get(0), home);
        for (House f : home.getArea()){

           // f.addHuman(home.getArea().get(0).getRooms().get(0).getHumans().get(0));

            for (Room r : f.getRooms()){
                //System.out.println("Huuu" + home.getArea().get(0).getRooms().get(0).getHumans().get(0));
                //r.addHuman(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
                //System.out.println(r.getHumans());
                //System.out.println(r.getHumans());
                for(Device d : r.getDevices()){
                    d.addUsers(home.getArea().get(0).getRooms().get(0).getHumans().get(0));
                    //System.out.println(d.getUsers());
                }
            }
        }
        /////////////////////////////////////////////////////

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
                    if (r.getName().equals("Kitchen") ) {
                        ek.Eating();
                        events.add("Eating");
                    } else {
                        el.Chilling();
                        events.add("Chilling");
                    }
                    rooms.add(r.getName());

                }
                //System.out.println();

            }
        }

        System.out.println("Report about Events "+events);
//        if(tem.equals("HOT")){
//            tem.DoColder();
//            events.add("HotTemperature");
//        }
//        else{
//            tem.DoHotter();
//            events.add("ColdTemperature");
//        }
//        if(9<clock && clock<18){
//            System.out.println(r.getName());
//            events.add(r.getName());
//            switch (rand.nextInt(2)) {
//                case 0:
//                    doing.Chill();
//                    events.add("Chill");
//                    break;
//                case 1:
//                    doing.Work();
//                    events.add("Work");
//                    break;
//                default:
//                    events.add("Error");
//                    break;
//            }
//        }
//        else{
//            doing.Night();
//            events.add("Night");
//        }

        /////////////////////////////////////////////////////
//        Random rand = new Random();
//        ArrayList<List<String>> Events = new ArrayList<>();
//        List<String> ListEvent;
//        DATETIME day = new DATETIME();
//        for(int i = 0; i<=10; i++){
//            switch (rand.nextInt(3)) {
//                case 0:
//                    ListEvent = day.ListEvents("HOT", 12);
//                    break;
//                case 1:
//                    ListEvent = day.ListEvents("HOT", 0);
//                    break;
//
//                case 2:
//                    ListEvent = day.ListEvents("COLD", 15);
//                    break;
//                case 3:
//                    ListEvent = day.ListEvents("COLD", 21);
//                    break;
//                default:
//                    ListEvent = day.ListEvents("HOT", 12);
//                    System.out.println("default Error Main");
//            }
//            Events.add(ListEvent);
//        }
//        System.out.println("Report about Events "+Events);
//        Make house + take DATETIME
//        DO Event
    }
}