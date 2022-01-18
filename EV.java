import Event.EventKitchen;
import Event.EventLivingRoom;
import Event.HouseAI;
import Maker.Area;
import Maker.House;
import Maker.Parking;
import Maker.Room;
import Strategy.DoStrategy;
import Strategy.Strategy;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;

import java.util.ArrayList;

public class EV {

    public ArrayList<String> EV(Area home){
        ArrayList<String> events = new ArrayList<>();
        EventKitchen ek = new EventKitchen();
        EventLivingRoom el = new EventLivingRoom();
        ArrayList<String> rooms = new ArrayList<>();


        Strategy s = new Strategy();
        DoStrategy doStrategy = new DoStrategy();
        HouseAI doing = new HouseAI();
        int NumberStrategy;
        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                if((r.getHumans()).size() == 1){
                    NumberStrategy = s.Strategy();
                    doStrategy.DoStrategy(r, doing, NumberStrategy);
                    if (r.getName().equals("Kitchen")) {
                        ek.Eating(r.getHumans(), r);
                        events.add("Eating");
                    } else {
                        el.Chilling(r.getHumans(), r, r.getAnimals());
                        events.add("Chilling");
                    }
                    rooms.add(r.getName());
                }
            }
            int count_wait = 0;
            for(Parking tr: h.getTrRooms()){
                if(tr.getTransport_Counter()< tr.getHuman_Counter()){
                    count_wait = tr.getTransport_Counter() - tr.getHuman_Counter();
                }
                int count_tr = 0;
                for(Ski ski: tr.getSkis()){
                    tr.getHumans().get(count_tr).setUseTransport(ski);
                    events.add("Ski");
                    count_tr +=1;
                }
                for (Bicycle b: tr.getBicycles()){
                    tr.getHumans().get(count_tr).setUseTransport(b);
                    events.add("Bicycle");
                    count_tr +=1;
                }
                for (Car c: tr.getCars()){
                    tr.getHumans().get(count_tr).setUseTransport(c);
                    count_tr +=1;
                    events.add("Car");
                }
                for(int w=0; w<count_wait; w++){
                    tr.getHumans().get(count_tr).Waiting();
                    events.add("Wait");
                }
            }
        }
        return events;
    }
}
