import Devices.Device;
import Event.EventKitchen;
import Event.EventLivingRoom;
import Event.HouseAI;
import LivingBeing.Animal;
import LivingBeing.Human;
import Maker.Area;
import Maker.House;
import Maker.Parking;
import Maker.Room;
import Strategy.DoStrategy;
import Strategy.Strategy;
import Transport.Bicycle;
import Transport.Car;
import Transport.Ski;
import Transport.Transport;

import java.util.ArrayList;

public class EventManager {
    ArrayList<String> events = new ArrayList<>();
    ArrayList<Device> deviceInEvents = new ArrayList<>();
    ArrayList<Human> SourceEvents = new ArrayList<>();
    ArrayList<Animal> animalsInEvents= new ArrayList<>();
    ArrayList<Transport> transportInEvents = new ArrayList<>();

    public void eventManager(Area home){

        EventKitchen ek = new EventKitchen();
        EventLivingRoom el = new EventLivingRoom();
        Strategy s = new Strategy();
        DoStrategy doStrategy = new DoStrategy();
        HouseAI doing = new HouseAI();
        int NumberStrategy;
        for(House h: home.getArea()){
            for(Room r: h.getRooms()){
                if((r.getHumans()).size() == 1){
                    NumberStrategy = s.Strategy();
                    doStrategy.DoStrategy(r, doing, NumberStrategy);
                    for(Device device: doStrategy.getDeviceInEvents()){
                        deviceInEvents.add(device);
                        events.add("SettingsOfHome");
                        animalsInEvents.add(null);
                        SourceEvents.add(null);
                        transportInEvents.add(null);
                    }
                    if (r.getName().equals("Kitchen")) {
                        ek.Eating(r.getHumans(), r);
                    } else {
                        el.Chilling(r.getHumans(), r, r.getAnimals());
                    }
                    animalsInEvents.addAll(ek.getAnimalsInEvents());
                    events.addAll(ek.getEvents());
                    SourceEvents.addAll(ek.getSourceEvents());
                    deviceInEvents.addAll(ek.getDeviceInEvents());
                    animalsInEvents.addAll(el.getAnimalsInEvents());
                    transportInEvents.addAll(ek.getTransportInEvents());
                    events.addAll(el.getEvents());
                    SourceEvents.addAll(el.getSourceEvents());
                    deviceInEvents.addAll(el.getDeviceInEvents());
                    transportInEvents.addAll(el.getTransportInEvents());

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
                    events.add("Use_Ski");
                    animalsInEvents.add(null);
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(ski);
                    count_tr +=1;
                }
                for (Bicycle b: tr.getBicycles()){
                    tr.getHumans().get(count_tr).setUseTransport(b);
                    events.add("Use_Bicycle");
                    animalsInEvents.add(null);
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(b);
                    count_tr +=1;
                }
                for (Car c: tr.getCars()){
                    tr.getHumans().get(count_tr).setUseTransport(c);
                    animalsInEvents.add(null);
                    events.add("Use_Car");
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(c);
                    count_tr +=1;

                }
                for(int w=0; w<count_wait; w++){
                    tr.getHumans().get(count_tr).Waiting();
                    animalsInEvents.add(null);
                    SourceEvents.addAll(tr.getHumans());
                    deviceInEvents.add(null);
                    transportInEvents.add(null);
                    events.add("Wait");
                }
            }
        }
    }

    public ArrayList<Animal> getAnimalsInEvents() {
        return animalsInEvents;
    }

    public ArrayList<String> getEvents(){
        return events;
    }

    public ArrayList<Device> getDeviceInEvents() {
        return deviceInEvents;
    }

    public ArrayList<Human> getSourceEvents() {
        return SourceEvents;
    }

    public ArrayList<Transport> getTransportInEvents() {
        return transportInEvents;
    }

}
