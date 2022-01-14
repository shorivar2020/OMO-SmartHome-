package Event;

import Devices.Computer;
import Devices.Fridge;
import LivingBeing.Human;
import Maker.Room;

import java.util.ArrayList;
import java.util.Random;

public class EventLivingRoom {
    Random rand = new Random();
    BrokenDevice broken = new BrokenDevice();
    public void Chilling(ArrayList<Human> Humans, Room room){
        for(Human h: Humans) {
            switch (rand.nextInt(2)) {
                case 0:
                    Computer c = (Computer)(room.getDevices().get(4));
                    if(c.work()){
                        continue;
                    }else{
                        broken.fix(c, h);
                    }
                    h.setUse(c);
                    c.addUsers(h);
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
