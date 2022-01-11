import omo-smart-home.Event.HotTempeture;
import java.util.Random;
public class DATETIME(String temperature, int clock) {
    public ArrayList<String> EventList = new ArrayList<String>();
    if(temperature == "HOT"){
        //HotTempeture();
        EventList.add("HotTempeture");
    }
    else{
        //ColdTemperature();
        EventList.add("ColdTempeture");
    }
    if(clock == "DAY"){
        switch (rand.nextInt(1)){
            case 0:
                //Chil();
                EventList.add("Chill");
                break;
            case 1:
                //Work();
                EventList.add("Work");
                break;
        }
    }
    else{
        //Night();
        this.EventList.add("Night");
    }
    return (EventList);
    //if Hot -> Event HotTemperature
    //If Cold -> Event ColdTemperature
    //if night -> Event Night + chill
    //if day -> chill/work randome
}