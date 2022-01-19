package Event;

import Devices.Device;
import LivingBeing.Human;

public class BrokenDevice{

    /**
     * Fixed or broke and buy new device if human find documentation
     *
     * @param device that need to be fixed
     * @param human who fix the device
     */
    public void fix(Device device, Human human){
        if(human.Find()){
            device.fixing();
        } else{
            device.buyNew();
        }
    }
}