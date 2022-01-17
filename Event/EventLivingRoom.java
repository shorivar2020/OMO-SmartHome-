package Event;

import Devices.Computer;
import Devices.Fridge;
import LivingBeing.Animal;
import LivingBeing.Human;
import Maker.Room;

import java.util.ArrayList;
import java.util.Random;

public class EventLivingRoom {
    Random rand = new Random();
    BrokenDevice broken = new BrokenDevice();
    public void Chilling(ArrayList<Human> Humans, Room room, ArrayList<Animal> Animals){
        Computer c = (Computer)(room.getDevices().get(4));
        for(Human h: Humans) {
            switch (rand.nextInt(3)) {
                case 0:
                    h.setUse(c);
                    c.addUsers(h);
                    if(c.work(c)){
//                    }else{
//                        broken.fix(c, h);
                    }

                    //System.out.println(h);
                    h.PlayComputerGames();
                    //person play computer games
                    c.stop();
                    break;
                case 1:
                    h.Sleeping();
                    break;
                case 2:
                    for (Animal a: Animals){
                        h.setWithAnimal(a);
                        a.setWithHuman(h);
                    }

            }
        }
    }
}
