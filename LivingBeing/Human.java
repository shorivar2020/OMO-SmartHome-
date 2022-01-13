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

    public List<Transport> getUseTransport() {
        return UseTransport;
    }


    public List<Animal> getWithAnimal() {
        return WithAnimal;
    }

    //    public void Use(){
//
//    }
//
//    public void Shopping(){
//
//    }
//
//    public void Eating(){
//
//    }
//
//    public void DrinkTea(){
//
//    }
//
//    public void PlayComputerGames(){
//
//    }
//
//    public void Sleeping(){
//
//    }
//
//    public void UseTransport(){
//
//    }
//
//    public void WithPet(){
//
//    }
}