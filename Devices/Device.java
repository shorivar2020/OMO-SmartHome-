package Devices;

import java.util.ArrayList;
import java.util.List;

public abstract class Device{

    private boolean deviceState; //0-off 1 - on
    private int electricity = 0; //1-...
    private int water = 0; //1-...
    private int documentation = 0; //??
    private int emloyed = 0; //was used
    private int functionallity = 100; //0-100%
    private int somethingIn; //0-no 1-yes
   // private List<User> users = new ArrayList<>();

//    public void work();
//    public void stop();

//    public int getDeviceState() {
//        return deviceState;
//    }

    public int getDocumentation() {
        return documentation;
    }

    public int getElectricity() {
        return electricity;
    }

    public int getWater() {
        return water;
    }

    public int getFunctionallity() {
        return functionallity;
    }

    public int getSomethingIn() {
        return somethingIn;
    }

//    public String getDeviceName(){
//        return device;
//    }
}