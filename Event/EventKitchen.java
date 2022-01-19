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
    ArrayList<String> events = new ArrayList<>();
    ArrayList<Device> deviceInEvents = new ArrayList<>();
    ArrayList<Human> SourceEvents = new ArrayList<>();
    ArrayList<Animal> animalsInEvents= new ArrayList<>();
    ArrayList<Transport> transportInEvents = new ArrayList<>();

    /**
     * Represent Event eating. By random exist 3 types of eating Event.
     * 1) Fast eating - use microwave and fridge. If in fridge no food -> Shopping.
     * In microwave add food and then return. (On/off microwave). Then human eating.
     * 2) Slow eating - use plate and fridge. If in fridge no food -> Shopping.
     * On plate add food and then return. (On/off plate). Then human eating.
     * 3) Drink tea - use teapot. (On/off). Then human drink tea.
     *
     * @param Humans who eat or dink
     * @param room in what room where even
     */
    public void Eating(ArrayList<Human> Humans, Room room){
        String food;
        Fridge f = (Fridge)(room.getDevices().get(4));
        Microwave m = (Microwave) (room.getDevices().get(5));
        Plate p = (Plate) (room.getDevices().get(6));
        Teapot t = (Teapot) (room.getDevices().get(7));

        for(Human h: Humans) {
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
                    if (f.getSomethingIn().size() == 0) {
                        Shopping shop = new Shopping();
                        shop.shopping(f);
                    }
                    food = f.removeSomethingIn("Food");
                    m.work(m);
                    m.addSomethingIn(food);
                    m.removeSomethingIn(food);
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
                    if (f.getSomethingIn().size() == 0) {
                        Shopping shop = new Shopping();
                        shop.shopping(f);
                        h.Shopping();
                    }
                    food = f.removeSomethingIn("Food");
                    p.work(p);
                    p.addSomethingOn(food);

                    p.removeSomethingOn(food);
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

    /**
     * @return all event that be in room
     */
    public ArrayList<String> getEvents(){
        return events;
    }

    /**
     * @return all device that be in event room
     */
    public ArrayList<Device> getDeviceInEvents() {
        return deviceInEvents;
    }

    /**
     * @return all human that be in event room
     */
    public ArrayList<Human> getSourceEvents() {
        return SourceEvents;
    }

    /**
     * @return all animal that be in event room
     */
    public ArrayList<Animal> getAnimalsInEvents() {
        return animalsInEvents;
    }

    /**
     * @param animals add animal who be in event
     */
    public void setAnimalsInEvents(Animal animals) {
        animalsInEvents.add(animals);
    }

    /**
     * @param d add device who be in event
     */
    public void setDeviceInEvents(Device d) {
        deviceInEvents.add(d);
    }

    /**
     * @param s add events who be in event
     */
    public void setEvents(String s) {
        events.add(s);
    }

    /**
     * @param h add human who be in event
     */
    public void setSourceEvents(Human h) {
        SourceEvents.add(h);
    }

    /**
     * @return all transport that be in event room
     */
    public ArrayList<Transport> getTransportInEvents() {
        return transportInEvents;
    }
}
