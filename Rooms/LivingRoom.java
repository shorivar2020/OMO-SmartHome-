package Rooms;

import Devices.Computer;

import java.util.Random;

public class LivingRoom{
    Random rand = new Random();
    public void Chilling(){
        switch(rand.nextInt(2)){
            case 0:
                Computer c = new Computer();
                c.work();
                //person play computer games
                c.stop();
            break;
        }
    }
}
