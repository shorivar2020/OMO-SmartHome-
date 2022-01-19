package Event;

import Devices.*;
import LivingBeing.Human;
import Maker.Room;

import java.util.ArrayList;

/**
 * Event without human, all do by sensor and AI house
 */
public class HouseAI {
    public ArrayList<String> HouseAIEvent = new ArrayList<>();
    ArrayList<Device> deviceInEvents = new ArrayList<>();

    /**
     * On light and blinds if night
     *
     * @param Humans all humans in rooms
     * @param room all rooms
     */
    public void Night(ArrayList<Human> Humans, Room room) {
        HouseAIEvent.add("Night");
        for(Human h: Humans) {
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            deviceInEvents.add(i);
            deviceInEvents.add(b);
            i.work(i);
            b.work(b);
            i.addUsers(h);
            b.addUsers(h);
            h.Sleeping();
        }
    }
    /**
     * Off light and blinds if day
     *
     * @param Humans all humans in rooms
     * @param room all rooms
     */
    public void Day(ArrayList<Human> Humans, Room room){
        HouseAIEvent.add("Day");
        for(Human h: Humans) {
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            deviceInEvents.add(i);
            deviceInEvents.add(b);
            i.stop();
            b.stop();
            i.addUsers(h);
            b.addUsers(h);
        }
    }
    /**
     * On conditioning if hot and off heater
     *
     * @param Humans all humans in rooms
     * @param room all rooms
     */
    public void DoColder(ArrayList<Human> Humans, Room room){
        HouseAIEvent.add("Hot");
        for(Human h: Humans) {
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            deviceInEvents.add(c);
            deviceInEvents.add(heat);
            c.work(c);
            heat.stop();
            heat.addUsers(h);
        }

    }
    /**
     * On heater if cold and off conditioning
     *
     * @param Humans all humans in rooms
     * @param room all rooms
     */
    public void DoHotter(ArrayList<Human> Humans, Room room){
        HouseAIEvent.add("Cold");
        for(Human h: Humans) {
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            deviceInEvents.add(c);
            deviceInEvents.add(heat);
            heat.work(heat);
            c.stop();
            heat.addUsers(h);
        }

    }

    /**
     * @return all device that use in Home AI events
     */
    public ArrayList<Device> getDeviceInEvents(){
        return deviceInEvents;
    }
}