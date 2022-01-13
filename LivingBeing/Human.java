package LivingBeing;

import Devices.Device;
import Maker.Room;
import Transport.Transport;


import java.util.ArrayList;
import java.util.List;

public class Human {
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

    public void DrinkTea(){
        Doings.add("DrinkTea");
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