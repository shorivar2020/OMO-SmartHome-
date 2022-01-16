package Maker;

public class HouseMaker{
    public House newHouse(int rooms, int people) {
        House house = new House();
        if(rooms>5){
            for(int j=0; j>2; j++){
                ParkingMaker tr = new ParkingMaker();
                house.isTransportRoomHere(true);
                house.setTransportRoom(tr.newTransportRoom());
            }
        }
        for (int i = 0; i < rooms; i++) {
            RoomMaker room = new RoomMaker();
            house.setRoom(room.newRoom());
        }


        //System.out.println("Made Maker.House with Rooms");
        return house;
    }
}