package LivingBeing;

import Devices.Device;
import Event.BrokenDevice;
import Maker.Room;
import Transport.Transport;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human {
    Random rand = new Random();
    Room WhatRoom;
//    String name;
    boolean InArea;
    private ArrayList<Device> Use = new ArrayList<>();
    private ArrayList<Transport> UseTransport = new ArrayList<>();
    private ArrayList<Animal> WithAnimal = new ArrayList<>();
    private ArrayList<String> Doings = new ArrayList<>();


//    public Room getWhatRoom() {
//        return WhatRoom;
//    }
//
//    public void setWhatRoom(Room whatRoom) {
//        this.WhatRoom = whatRoom;
//    }
//
//    public boolean getInArea() {
//        return InArea;
//    }
//
//    public void setInArea(boolean inArea) {
//        this.InArea = inArea;
//    }

    public ArrayList<Device> getUse() {
        return Use;
    }

    public void setUse(Device device) {
        Use.add(device);
    }

    public ArrayList<Transport> getUseTransport() {
        return UseTransport;
    }

    public void setUseTransport(Transport transport) {
        UseTransport.add(transport);
    }

    public ArrayList<Animal> getWithAnimal() {
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
        Doings.add("DRINK_TEA");
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

    public ArrayList<String> getDoings() {
        return Doings;
    }

    public void getNotify(Device d, Human h){
        BrokenDevice broken = new BrokenDevice();
        broken.fix(d, h);
        Doings.add("GetNotifyAboutFix");}

}