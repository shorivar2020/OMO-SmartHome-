package Event;

import Devices.*;
import LivingBeing.Human;
import Maker.Room;

import java.util.ArrayList;

public class HouseAI {
    Human HouseAI;

    public void Night(ArrayList<Human> Humans, Room room) {
        for(Human h: Humans) {
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            i.work();
            b.work();
            i.addUsers(HouseAI);
            b.addUsers(HouseAI);
            h.Sleeping();
        }
    }

    public void Day(ArrayList<Human> Humans, Room room){
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            i.stop();
            b.stop();
            i.addUsers(HouseAI);
            b.addUsers(HouseAI);
    }

    public void DoColder( Room room){
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            c.work();
            heat.stop();
            heat.addUsers(HouseAI);

    }

    public void DoHotter( Room room){
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            heat.work();
            c.stop();
            heat.addUsers(HouseAI);

    }
}