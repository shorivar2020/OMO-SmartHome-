package Maker;

import LivingBeing.Human;

import java.util.ArrayList;
import java.util.List;

public class House {

    private ArrayList<Room> rooms = new ArrayList<Room>();
    private ArrayList<Human> humans = new ArrayList<>();

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addHuman(Human human){
        humans.add(human);
    }

    public void setRoom(Room room) {
        rooms.add(room);
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