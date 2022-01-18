package Maker;

import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;

import java.util.ArrayList;

public class Room {
    String name;
    private ArrayList<Device> devices = new ArrayList<>();
    private ArrayList<Human> humans = new ArrayList<>();
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addDevice(Device device){
        devices.add(device);
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }
    public void addHuman(Human human){
        humans.add(human);
    }

    public String getName() {
        return name;
    }

    public void addName(String name){
        this.name = name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public ArrayList<Animal> getAnimals(){
        return animals;
    }
}