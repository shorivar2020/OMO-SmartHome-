package Event;

import Devices.*;
import LivingBeing.Human;
import Maker.Room;

import java.util.ArrayList;

public class HouseAI {
    Human HouseAI;
    public ArrayList<String> HouseAIEvent = new ArrayList<>();
    public void Night(ArrayList<Human> Humans, Room room) {
        HouseAIEvent.add("Night");
        for(Human h: Humans) {
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            i.work(i);
            b.work(b);
            i.addUsers(h);
            b.addUsers(h);
            h.Sleeping();
        }
    }

    public void Day(ArrayList<Human> Humans, Room room){
        HouseAIEvent.add("Day");
        for(Human h: Humans) {
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            i.stop();
            b.stop();
            i.addUsers(h);
            b.addUsers(h);
        }
    }

    public void DoColder(ArrayList<Human> Humans, Room room){
        HouseAIEvent.add("Hot");
        for(Human h: Humans) {
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            c.work(c);
            heat.stop();
            heat.addUsers(h);
        }

    }

    public void DoHotter(ArrayList<Human> Humans, Room room){
        HouseAIEvent.add("Cold");
        for(Human h: Humans) {
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            heat.work(heat);
            c.stop();
            heat.addUsers(h);
        }

    }
}