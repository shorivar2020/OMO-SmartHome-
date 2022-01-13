package Maker;

import Devices.Device;
import Devices.FabriceDevice;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class TransportRoomMaker {
    Random rand = new Random();
    private ArrayList<String> dev = new ArrayList<>();
    public TransportRoom newTransportRoom(){
        TransportRoom transportRoom = new TransportRoom();
        return transportRoom;
    }
}
