import Rooms.TransportRoom;

import java.util.Random;

public class AreaMaker extends Area {
    public Area newHome(int rooms, int people, int animals){
        Area area = new Area();
        HouseMaker newHouse = new HouseMaker();
        Random rand = new Random();
        //DO FLOOR
        House house = newHouse.newHouse(rooms);
        area.addFloor(house);
        //DO TRANSPORT ROOM
        area.getTransportRoom(new TransportRoom());
        System.out.println("Made Area");
        return area;
    }
}
