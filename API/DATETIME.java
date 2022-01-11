package API;
import Event.Temperature;

import java.util.Random;
import java.util.ArrayList;
public class DATETIME{

    Random rand = new Random();
    public ArrayList<String> ListEvents(String temperature, int clock){
        ArrayList<String> events = new ArrayList<>();
        Temperature tem = new Temperature();
        if(temperature.equals("HOT")){
            tem.DoColder();
            events.add("HotTemperature");
        }
        else{
            tem.DoHotter();
            events.add("ColdTemperature");
        }
        if(9<clock && clock<18){
            switch (rand.nextInt(2)) {
                case 0:
                        //Chill();
                    events.add("Chill");
                    break;
                case 1:
                        //Work();
                    events.add("Work");
                    break;
                default:
                    events.add("Chill");
                    break;
            }
        }
        else{
            //Night();
            events.add("Night");
        }
        return events;
    }

    //if Hot -> Event HotTemperature
    //If Cold -> Event ColdTemperature
    //if night -> Event Night + chill
    //if day -> chill/work randome
}