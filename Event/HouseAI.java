package Event;

import Devices.*;
import LivingBeing.Human;
import Maker.Room;

public class HouseAI {
    Human HouseAI;
    public void Night(Room room) {
            Illumination i = (Illumination) (room.getDevices().get(0));
            Blinds b = (Blinds) (room.getDevices().get(1));
            i.work();
            b.work();
            i.addUsers(HouseAI);
            b.addUsers(HouseAI);
    }

    public void Day( Room room){
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
            heat.addUsers(HouseAI);

    }

    public void DoHotter( Room room){
            Conditioning c = (Conditioning) (room.getDevices().get(3));
            Heater heat = (Heater) (room.getDevices().get(2));
            heat.work();
            c.stop();
            heat.addUsers(HouseAI);
            heat.addUsers(HouseAI);

    }
}