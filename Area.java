import Rooms.TransportRoom;

import java.util.ArrayList;

public class Area {
    ArrayList<House> house = new ArrayList<>();
    private TransportRoom transportRoom;

    public void addFloor(House house) {
        this.house.add(house);
    }

    public void getTransportRoom(TransportRoom transportRoom) {
        this.transportRoom = transportRoom;
    }
}