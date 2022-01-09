package Devices;

import java.util.ArrayList;
import java.util.List;

public abstract class Device{

    private int deviceState; //0-off 1-wait 2 - on
    private int emloyed = 0; //was used
    private int workable = 100;
    private int workableNow;
    private List<User> users = new ArrayList<>();
    //Musim vyresit

    public String getDeviceName(){
        return device;
    }
}