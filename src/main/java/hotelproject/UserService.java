package hotelproject;

import java.util.List;

public class UserService {
    private Hotel hotel = new Hotel();

    public List<Room> getAllRooms(){
        return hotel.getRooms();
    }
}
