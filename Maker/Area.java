package Maker;

import java.util.ArrayList;

public class Area {
    ArrayList<House> house = new ArrayList<>();
    private House.TransportRoom transportRoom;

    public void addFloor(House house) {
        this.house.add(house);
    }

    public void getTransportRoom(House.TransportRoom transportRoom) {
        this.transportRoom = transportRoom;
    }
}