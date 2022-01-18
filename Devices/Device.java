package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public abstract class Device{

    public abstract void On();

    public abstract void Off();

    public abstract void addUsers(Human human);

    public abstract ArrayList<Human> getUsers();

    public abstract int getElectricity();

    public abstract String getDocumentation();

    public abstract String getDeviceName();

    public abstract int getWater();

    public abstract void fixing();

    public abstract void buyNew();

    public abstract int getMoney();

    public void work(Device d){
        if (getFunctionality() == 0) {
            for (Human h : getUsers()) {
                h.getNotify(d, h);
            }
        }
        setFunctionality();
        On();
    }

    public void stop(){
        Off();
    }

    protected abstract void setFunctionality();

    protected abstract int getFunctionality();
}