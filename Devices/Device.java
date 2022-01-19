package Devices;

import LivingBeing.Human;

import java.util.ArrayList;

public abstract class Device{

    /**
     * change device state - true
     */
    public abstract void On();
    /**
     * change device state - false
     */
    public abstract void Off();
    /**
     * @param human add who use this device
     */
    public abstract void addUsers(Human human);
    /**
     * @return all humans who use this device
     */
    public abstract ArrayList<Human> getUsers();
    /**
     * @return count of electricity this device
     */
    public abstract int getElectricity();

    /**
     * @return documentation of this device
     */
    public abstract String getDocumentation();

    /**
     * @return type of this device
     */
    public abstract String getDeviceName();

    /**
     * @return count of water this device
     */
    public abstract int getWater();

    /**
     *  do functionality on 100%
     */
    public abstract void fixing();

    /**
     * do functionality on 100%, but spend money on it (depend on cost)
     */
    public abstract void buyNew();

    /**
     * @return count of money this device
     */
    public abstract int getMoney();

    /**
     * Work device if functionality > 100%, else send notify human about broken device
     *
     * @param d what device work
     */
    public void work(Device d){
        if (getFunctionality() == 0) {
            for (Human h : getUsers()) {
                h.getNotify(d, h);
            }
        }
        setFunctionality();
        On();
    }

    /**
     * stop work of device
     */
    public void stop(){
        Off();
    }

    /**
     * change functionality of device in work
     */
    protected abstract void setFunctionality();

    /**
     * @return count of device functionality
     */
    protected abstract int getFunctionality();
}