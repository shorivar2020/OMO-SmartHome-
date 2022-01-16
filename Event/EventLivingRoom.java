package Event;

import Devices.Computer;
import Devices.Fridge;
import LivingBeing.Human;
import Maker.Room;
import Maker.RoomHouse;

import java.util.ArrayList;
import java.util.Random;

public class EventLivingRoom {
    Random rand = new Random();
    BrokenDevice broken = new BrokenDevice();
    public void Chilling(ArrayList<Human> Humans, Room room){
        Computer c = (Computer)(((RoomHouse) room).getDevices().get(4));
        for(Human h: Humans) {
            switch (rand.nextInt(2)) {
                case 0:
                    if(c.work()){
                    }else{
                        broken.fix(c, h);
                    }
                    h.setUse(c);
                    c.addUsers(h);
                    //System.out.println(h);
                    h.PlayComputerGames();
                    //person play computer games
                    c.stop();
                    break;
                case 1:
                    h.Sleeping();
                    break;
            }
        }
    }
}
