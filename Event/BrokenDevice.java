package Event;

import Devices.Device;
import LivingBeing.Human;

import java.util.Random;

public class BrokenDevice{
    Random rand = new Random();

    public void fix(Device device, Human human){
        if(human.Find()){
            device.fixing();
            //System.out.println("You fix it yeee");
        } else{
            //System.out.println("You broke it");
            device.buyNew();
        }
    }
    //System.out.println("BrokenDevice");
    //rand (2)
    //case buy new Finance
    //case fix
}