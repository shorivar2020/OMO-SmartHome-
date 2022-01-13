package Maker;

import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;

import java.util.ArrayList;

public class TransportRoom {
    String name;
    private ArrayList<Device> devices = new ArrayList<>();
    private ArrayList<Human> humans = new ArrayList<>();
    private ArrayList<Animal> animals = new ArrayList<>();
    int Human_Counter = 0;

    public void addDevice(Device device){
        devices.add(device);
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }
    public int getHuman_Counter(){
        return Human_Counter;
    }
    public void addHuman(Human human){
        humans.add(human);
        Human_Counter++;
    }
}
