package LivingBeing;

import Devices.Device;
import Maker.Room;
import Transport.Transport;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human {
    Random rand = new Random();
    Room WhatRoom;
    boolean InArea;
    private List<Device> Use = new ArrayList<>();
    private List<Transport> UseTransport = new ArrayList<>();
    private List<Animal> WithAnimal = new ArrayList<>();
    private List<String> Doings = new ArrayList<>();


    public Room getWhatRoom() {
        return WhatRoom;
    }

    public void setWhatRoom(Room whatRoom) {
        this.WhatRoom = whatRoom;
    }

    public boolean getInArea() {
        return InArea;
    }

    public void setInArea(boolean inArea) {
        this.InArea = inArea;
    }

    public List<Device> getUse() {
        return Use;
    }

    public void setUse(Device device) {
        Use.add(device);
    }

    public List<Transport> getUseTransport() {
        return UseTransport;
    }

    public void setUseTransport(Transport transport) {
        UseTransport.add(transport);
    }

    public List<Animal> getWithAnimal() {
        return WithAnimal;
    }

    public void setWithAnimal(Animal animal) {
        WithAnimal.add(animal);
    }

    public void Shopping(){
        Doings.add("SHOPPING");
    }

    public void Eating(){
        Doings.add("EATING");
    }

    public void Waiting(){
        Doings.add("WAITING");
    }

    public void DrinkTea(){
        Doings.add("DrinkTea");
    }

    public boolean Find(){
        Doings.add("FIND_DOCUMENTATION");
        switch(rand.nextInt(3)){
            case 0:
                Doings.add("FIND_DOCUMENTATION");
                return true;
            case 1:
                Doings.add("NOT_FIND_DOCUMENTATION");
                return false;
            case 2:
                Doings.add("NOT_FIND");
                return false;
            case 3:
                Doings.add("FORGET_DOCUMENTATION");
                return false;
        }
        return false;
    }
    public void PlayComputerGames(){
        Doings.add("PLAY_COMPUTER_GAMES");
    }

    public void Sleeping(){
        Doings.add("SLEEPING");
    }

    public List<String> getDoings() {
        return Doings;
    }
}