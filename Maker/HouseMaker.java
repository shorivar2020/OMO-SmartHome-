package Maker;

public class HouseMaker{
    /**
     * Create new House and then do RoomMaker and ParkingMaker. Check in house that create transport room.
     *
     * @param rooms - count rooms in house
     * @return new house with rooms and parking
     */
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