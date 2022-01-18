package Event;

import Devices.Device;
import LivingBeing.Human;

public class BrokenDevice{

    public void fix(Device device, Human human){
        if(human.Find()){
            device.fixing();
            System.out.println("You fix it");
        } else{
            System.out.println("You broke it");
            device.buyNew();
        }
    }
}