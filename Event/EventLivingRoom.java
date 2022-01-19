package Event;

import Devices.Computer;
import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;
import Maker.Room;
import Transport.Transport;

import java.util.ArrayList;
import java.util.Random;

public class EventLivingRoom{
    Random rand = new Random();
    ArrayList<String> events = new ArrayList<>();
    ArrayList<Device> deviceInEvents = new ArrayList<>();
    ArrayList<Human> SourceEvents = new ArrayList<>();
    ArrayList<Animal> animalsInEvents= new ArrayList<>();
    ArrayList<Transport> transportInEvents = new ArrayList<>();

    /**
     * Represent Event chilling. By random exist 3 types of chilling event.
     * 1)Play_Computer_Games - use computer (on/of). Then human play.
     * 2)Sleeping - human sleeping
     * 3)Play with animal - take animal who in room and human play with it.
     *
     * @param Humans who do event
     * @param room where do event
     * @param Animals list with animals who in this room
     */
    public void Chilling(ArrayList<Human> Humans, Room room, ArrayList<Animal> Animals){
        Computer c = (Computer)(room.getDevices().get(4));
        for(Human h: Humans) {
            switch (rand.nextInt(3)) {
                case 0:
                    setAnimalsInEvents(null);
                    setDeviceInEvents(c);
                    setEvents("Play_Computer_Games");
                    setSourceEvents(h);
                    transportInEvents.add(null);
                    h.setUse(c);
                    c.addUsers(h);
                    c.work(c);
                    h.PlayComputerGames();
                    c.stop();
                    break;
                case 1:
                    setAnimalsInEvents(null);
                    setDeviceInEvents(null);
                    setEvents("Sleeping");
                    setSourceEvents(h);
                    transportInEvents.add(null);
                    h.Sleeping();
                    break;
                case 2:
                    for (Animal a: Animals){
                        h.setWithAnimal(a);
                        a.setWithHuman(h);
                        setAnimalsInEvents(a);
                        setDeviceInEvents(null);
                        transportInEvents.add(null);
                        setEvents("Play_with_Animals");
                        setSourceEvents(h);
                    }
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
