package Maker;

import java.util.ArrayList;

public class Area {
    private static Area instance;
    private Area(){}
    public static Area getInstance(){
        if(instance == null){
            instance = new Area();
        }
        return instance;
    }
    ArrayList<House> area = new ArrayList<>();
    private Parking parking;
   // private House.TransportRoom transportRoom;

    public ArrayList<House> getArea() {
        return area;
    }

    public void addHouse(House house) {
        this.area.add(house);
    }

    public void addParking(Parking parking){this.parking = parking;}

    public Parking getParking(){return parking;}

//    public void getTransportRoom(House.TransportRoom transportRoom) {
//        this.transportRoom = transportRoom;
//    }
}