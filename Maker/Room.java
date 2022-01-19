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

    /**
     * @param device add in room
     */
    public void addDevice(Device device){
        devices.add(device);
    }

    /**
     * @return all device in room
     */
    public ArrayList<Device> getDevices() {
        return devices;
    }

    /**
     * @return all humans in room
     */
    public ArrayList<Human> getHumans() {
        return humans;
    }

    /**
     * @param human add in room
     */
    public void addHuman(Human human){
        humans.add(human);
    }

    /**
     * @return type of room - Living room or Kitchen
     */
    public String getName() {
        return name;
    }

    /**
     * @param name took type of room - Living room or Kitchen
     */
    public void addName(String name){
        this.name = name;
    }

    /**
     * @param animal add in room
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * @return all animal in room
     */
    public ArrayList<Animal> getAnimals(){
        return animals;
    }
}