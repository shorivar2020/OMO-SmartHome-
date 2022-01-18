package Maker;

public class HouseMaker{
    public House newHouse(int rooms) {
        House house = new House();
        for (int i = 0; i < rooms; i++) {
            RoomMaker room = new RoomMaker();
            house.setRoom(room.newRoom());
        }
        ParkingMaker tr = new ParkingMaker();
        house.isTransportRoomHere(true);
        house.setTransportRoom(tr.newTransportRoom());
        return house;
    }
}