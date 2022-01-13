package Maker;

import LivingBeing.Human;

import java.util.ArrayList;

public class House {

    private ArrayList<Room> rooms = new ArrayList<Room>();
    private ArrayList<Human> humans = new ArrayList<>();
    private ArrayList<TransportRoom> trRooms= new ArrayList<TransportRoom>();
    boolean TransportRoomHere = false;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addHuman(Human human){
        humans.add(human);
    }

    public void setRoom(Room room) {
        rooms.add(room);
    }

    public void isTransportRoomHere(boolean tr) {
        this.TransportRoomHere = tr;
    }

    public ArrayList<TransportRoom> getTrRooms() {
        return trRooms;
    }

    public void setTransportRoom(TransportRoom tr){ trRooms.add(tr);}

//    public static class TransportRoom{
//        List<String> transports = new ArrayList<>();
//
//        public TransportRoom(){
//        }
//
//        public String addSomethingIn(String transport) {
//            this.transports.add(transport);
//            //System.out.println("In fridge "+somethingIn);
//            return transport;
//        }
//
//
//        public String removeSomethingIn(String transport) {
//            this.transports.remove(transport);
//            //System.out.println("In out " +somethingIn);
//            return transport;
//        }
//    }
}