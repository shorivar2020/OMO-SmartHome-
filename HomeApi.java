import java.util.ArrayList;
import java.util.List;

public class Home newHome(int Rooms, String Devices, int LivingBeings){
        Home home() = new Home();
        Room newRoom = new RoomAPI();

        for(int i = 0; i< Rooms; i++){
        Room room = newRoom.newRoom(Devices);
        home.addRoom(room);
        }

        for(int i = 0; i< LivingBeings; i++){
            home.getRoom().get(0).addlivingBeing(new livingBeing());
        }
        home.setTransportRoom(new TransportRoom());
        return home;
        }