import Event.EventKitchen;
import Event.EventLivingRoom;
import Event.HouseAI;
import Maker.Area;
import Maker.House;
import Maker.Parking;
import Maker.Room;
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

        Sensor sensor = new Sensor();
        int clock = sensor.SensorClock();
        String temperature = sensor.SensorTemperature();

        HouseAI doing = new HouseAI();
        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                //System.out.println(r.getHumans());
                if((r.getHumans()).size() == 1){
                    if(temperature.equals("HOT")){
                        doing.DoColder(r.getHumans(), r);
                        events.add("HotTemperature");
                    }
                    else{
                        doing.DoHotter(r.getHumans(), r);
                        events.add("ColdTemperature");
                    }
                    if(9<clock && clock<18) {
                        doing.Day(r.getHumans(), r);
                        if (r.getName().equals("Kitchen")) {
                            ek.Eating(r.getHumans(), r);
                            events.add("Eating");
                        } else {
                            el.Chilling(r.getHumans(), r, r.getAnimals());
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
        return events;
    }
}
