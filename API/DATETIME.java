package API;
import Devices.Device;
import Event.Temperature;
import Event.DoingSomething;
import Maker.House;
import Maker.Room;

import java.util.Random;
import java.util.ArrayList;
public class DATETIME{

    Random rand = new Random();
    public ArrayList<String> ListEvents(String temperature, int clock){
        ArrayList<String> events = new ArrayList<>();
        Temperature tem = new Temperature();
        DoingSomething doing = new DoingSomething();

        if(temperature.equals("HOT")){
            tem.DoColder();
            events.add("HotTemperature");
        }
        else{
            tem.DoHotter();
            events.add("ColdTemperature");
        }
        if(9<clock && clock<18){
           // System.out.println(r.getName());
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
        }
        else{
            doing.Night();
            events.add("Night");
        }
        return events;
    }
}