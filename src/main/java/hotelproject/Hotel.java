package hotelproject;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Room> rooms = new ArrayList<>();

    public Hotel() {
        // Creating a number of rooms.
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room());
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
