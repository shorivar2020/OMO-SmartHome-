package Maker;

import java.util.ArrayList;

public class Area {
    ArrayList<House> area = new ArrayList<>();
    private House.TransportRoom transportRoom;

    public ArrayList<House> getArea() {
        return area;
    }

    public void addFloor(House house) {
        this.area.add(house);
    }

    public void getTransportRoom(House.TransportRoom transportRoom) {
        this.transportRoom = transportRoom;
    }
}