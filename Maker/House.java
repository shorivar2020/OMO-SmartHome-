package Maker;

import java.util.ArrayList;

public class House {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Parking> Parking = new ArrayList<>();
    boolean TransportRoomHere = false;

    /**
     * @return List of existing rooms in this House
     */
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    /**
     * @param room add in house
     */
    public void setRoom(Room room) {
        rooms.add(room);
    }

    /**
     * @param tr true - if was made transport room
     */
    public void isTransportRoomHere(boolean tr) {
        this.TransportRoomHere = tr;
    }

    /**
     * @return Parking in this house
     */
    public ArrayList<Parking> getTrRooms() {
        return Parking;
    }

    /**
     * @param tr add parking in this house
     */
    public void setTransportRoom(Parking tr){ Parking.add(tr);}

}