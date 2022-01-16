package LivingBeing;

import Maker.Room;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    Room WhatRoom;
    boolean InArea;
    private List<Human> WithHuman = new ArrayList<>();
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

    public List<Human> getWithHuman() {
        return WithHuman;
    }

    public void setWithHuman(Human human) {
        WithHuman.add(human);
    }

}