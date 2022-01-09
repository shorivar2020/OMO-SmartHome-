import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Room> rooms = new ArrayList<>();
    public Home(List<Room> rooms){
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRooms(Room room){
        this.rooms.add(room);
    }
}