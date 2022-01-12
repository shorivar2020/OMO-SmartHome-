package Maker;

import java.util.ArrayList;
import java.util.List;

public class House {

    private ArrayList<Room> house = new ArrayList<Room>();

    public void setRoom(Room room) {
        house.add(room);
    }

    public static class TransportRoom{
        List<String> transports = new ArrayList<>();

        public TransportRoom(){
        }

        public String addSomethingIn(String transport) {
            this.transports.add(transport);
            //System.out.println("In fridge "+somethingIn);
            return transport;
        }

        public String removeSomethingIn(String transport) {
            this.transports.remove(transport);
            //System.out.println("In out " +somethingIn);
            return transport;
        }
    }
}