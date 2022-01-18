package Maker;

import java.util.ArrayList;

public class House {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Parking> Parking = new ArrayList<>();
    boolean TransportRoomHere = false;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRoom(Room room) {
        rooms.add(room);
    }

    public void isTransportRoomHere(boolean tr) {
        this.TransportRoomHere = tr;
    }

    public ArrayList<Parking> getTrRooms() {
        return Parking;
    }

    public void setTransportRoom(Parking tr){ Parking.add(tr);}

}