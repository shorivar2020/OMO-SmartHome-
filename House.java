import java.util.ArrayList;

public class House {

    private ArrayList<Room> house = new ArrayList<Room>();

    public void setRoom(Room room) {
        house.add(room);
    }
}