package Maker;

import java.util.ArrayList;

public class Area {
    ArrayList<House> area = new ArrayList<>();
    private Parking parking;

    public ArrayList<House> getArea() {
        return area;
    }

    public void addHouse(House house) {
        this.area.add(house);
    }

    public void addParking(Parking parking){this.parking = parking;}

    public Parking getParking(){return parking;}
}