package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public abstract class Device{
    String name;
    private boolean deviceState; //0-off 1 - on
    private int electricity = 0; //1-...
    private int water = 0; //1-...
    private int documentation = 0; //??
    private int emloyed = 0; //was used
    private int functionality = 100; //0-100%
    private int somethingIn; //0-no 1-yes
    private int buying = 0;
    private int cost = 2000;
    private ArrayList<Human> users = new ArrayList<>();

    public abstract void addUsers(Human human);

    public abstract ArrayList<Human> getUsers();

    public abstract int getElectricity();

    public abstract String getDeviceName();

    public abstract int getWater();

    public abstract void fixing();

    public abstract void buyNew();

    public abstract int getMoney();

    // private List<User> users = new ArrayList<>();

//    public void work();
//    public void stop();

//    public int getDeviceState() {
//        return deviceState;
//    }

//    public int getDocumentation() {
//        return documentation;
//    }
//
//    public int getElectricity() {
//        return electricity;
//    }
//
//    public int getWater() {
//        return water;
//    }
//
//    public int getFunctionallity() {
//        return functionallity;
//    }
//
//    public int getSomethingIn() {
//        return somethingIn;
//    }

//    public String getDeviceName(){
//        return device;
//    }
}