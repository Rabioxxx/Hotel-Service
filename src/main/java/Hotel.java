import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room("010"));
        rooms.add(new Room("011"));
        rooms.add(new Room("012"));
        rooms.add(new Room("013"));
        rooms.add(new Room("014"));
        rooms.add(new Room("015"));
    }
}
