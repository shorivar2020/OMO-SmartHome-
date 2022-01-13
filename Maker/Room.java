package Maker;

import Devices.Device;
import LivingBeing.Animal;
import LivingBeing.Human;

import java.util.ArrayList;
//import java.util.List;
//
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
    //    private String name;
//    private List<Device> devices = new ArrayList<>();
//    private List<Person> people = new ArrayList<>();
//    private List<Pet> pets = new ArrayList<>();
//    private List<Transport> transports = new ArrayList<>();
//
//    public List<Person> getPeople() {
//        return people;
//    }
//
//    public List<Pet> getPets() {
//        return pets;
//    }
//
//    public List<Device> getDevices() {
//        return devices;
//    }
//
//    public List<Transport> getTransports() {
//        return transports;
//    }
//
//    public Maker.Room addPerson(Person person){
//        peple.add(person);
//        return this;
//    }
//
//    public Maker.Room addPet(Pet pet){
//        pets.add(pet);
//        return this;
//    }
//
//    public void removePerson(Person person){
//        people.remove(person);
//    }
//
//    public void removePet(Pet pet){
//        pets.remove(pet);
//    }
}