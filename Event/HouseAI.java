package Event;

import Devices.*;
import LivingBeing.Human;
import Maker.Room;
import Maker.RoomHouse;

import java.util.ArrayList;

public class HouseAI {
    Human HouseAI;
    public ArrayList<String> HouseAIEvent = new ArrayList<>();
    public void Night(ArrayList<Human> Humans, Room room) {
        HouseAIEvent.add("Night");
        for(Human h: Humans) {
            Illumination i = (Illumination) (((RoomHouse) room).getDevices().get(0));
            Blinds b = (Blinds) (((RoomHouse) room).getDevices().get(1));
            i.work();
            b.work();
            i.addUsers(HouseAI);
            b.addUsers(HouseAI);
            h.Sleeping();
        }
    }

    public void Day(ArrayList<Human> Humans, Room room){
            HouseAIEvent.add("Day");
            Illumination i = (Illumination) (((RoomHouse) room).getDevices().get(0));
            Blinds b = (Blinds) (((RoomHouse) room).getDevices().get(1));
            i.stop();
            b.stop();
            i.addUsers(HouseAI);
            b.addUsers(HouseAI);
    }

    public void DoColder( Room room){
            HouseAIEvent.add("Hot");
            Conditioning c = (Conditioning) (((RoomHouse) room).getDevices().get(3));
            Heater heat = (Heater) (((RoomHouse) room).getDevices().get(2));
            c.work();
            heat.stop();
            heat.addUsers(HouseAI);

    }

    public void DoHotter( Room room){
            HouseAIEvent.add("Cold");
            Conditioning c = (Conditioning) (((RoomHouse) room).getDevices().get(3));
            Heater heat = (Heater) (((RoomHouse) room).getDevices().get(2));
            heat.work();
            c.stop();
            heat.addUsers(HouseAI);

    }
}