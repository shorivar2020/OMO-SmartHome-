package Event;

import Devices.*;
import LivingBeing.Animal;
import LivingBeing.Human;
import Maker.Room;
import Transport.Transport;

import java.util.Random;
import java.util.ArrayList;

public class EventKitchen {
    Random rand = new Random();
    BrokenDevice broken = new BrokenDevice();
    ArrayList<String> events = new ArrayList<>();
    ArrayList<Device> deviceInEvents = new ArrayList<>();
    ArrayList<Human> SourceEvents = new ArrayList<>();
    ArrayList<Animal> animalsInEvents= new ArrayList<>();
    ArrayList<Transport> transportInEvents = new ArrayList<>();
    public void Eating(ArrayList<Human> Humans, Room room){
        String meal;
        Fridge f = (Fridge)(room.getDevices().get(4));
        Microwave m = (Microwave) (room.getDevices().get(5));
        Plate p = (Plate) (room.getDevices().get(6));
        Teapot t = (Teapot) (room.getDevices().get(7));

        for(Human h: Humans) {
            System.out.println("Eating:" + h);
            switch(rand.nextInt(3))
            {
                case 0:
                    setAnimalsInEvents(null);
                    setDeviceInEvents(f);
                    setDeviceInEvents(m);
                    setEvents("Fast_Eating_With_Microwave");
                    setSourceEvents(h);
                    transportInEvents.add(null);
                    h.setUse(f);
                    f.addUsers(h);
                    h.setUse(m);
                    m.addUsers(h);
                    f.work(f);
                    if(f.getSomethingIn().size() != 0){
                        meal = f.removeSomethingIn("Food");
                    }
                    else{
                        Shoping shop = new Shoping();
                        shop.Shoping(f);
                        meal = f.removeSomethingIn("Food");
                    }
                    m.work(m);
                    m.addSomethingIn(meal);
                    m.removeSomethingIn(meal);
                    m.stop();
                    h.Eating();
                    break;
                case 1:
                    setAnimalsInEvents(null);
                    setDeviceInEvents(f);
                    setDeviceInEvents(p);
                    setEvents("Slow_Eating_With_Plate");
                    setSourceEvents(h);
                    transportInEvents.add(null);
                    h.setUse(f);
                    f.addUsers(h);
                    h.setUse(p);
                    p.addUsers(h);
                    f.work(f);
                    if(f.getSomethingIn().size() != 0){
                        meal = f.removeSomethingIn("Food");
                    }
                    else{
                        Shoping shop = new Shoping();
                        shop.Shoping(f);
                        h.Shopping();
                        meal = f.removeSomethingIn("Food");
                    }
                    p.work(p);
                    p.addSomethingOn(meal);

                    p.removeSomethingOn(meal);
                    p.stop();
                    h.Eating();
                    break;
                case 2:
                    setAnimalsInEvents(null);
                    setDeviceInEvents(t);
                    setEvents("Drink_Tea");
                    setSourceEvents(h);
                    transportInEvents.add(null);
                    h.setUse(t);
                    t.addUsers(h);
                    t.work(t);
                    h.DrinkTea();
                    t.stop();
                    break;
            }
        }
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

    public ArrayList<Animal> getAnimalsInEvents() {
        return animalsInEvents;
    }

    public void setAnimalsInEvents(Animal animals) {
        animalsInEvents.add(animals);
    }

    public void setDeviceInEvents(Device d) {
        deviceInEvents.add(d);
    }

    public void setEvents(String s) {
        events.add(s);
    }

    public void setSourceEvents(Human h) {
        SourceEvents.add(h);
    }

    public ArrayList<Transport> getTransportInEvents() {
        return transportInEvents;
    }

    public void setTransportInEvents(Transport tran) {
        transportInEvents.add(tran);
    }
}
