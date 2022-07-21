package hotelproject;

import java.util.Random;

public class Room {
    private int roomNr;
    private int sleeps; // number of persons in room.
    private boolean haveBathroom;
    private boolean isOccupied;
    private static int nextRoomNr = 1;

    // Creates a room with randomized characteristics.
    public Room() {
        roomNr = nextRoomNr;
        nextRoomNr++;

        Random random = new Random();
        sleeps = random.nextInt(6) + 1;
        haveBathroom = random.nextBoolean();
        isOccupied = random.nextBoolean();
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", sleeps=" + sleeps +
                ", haveBathroom=" + haveBathroom +
                ", isOccupied=" + isOccupied +
                '}';
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
