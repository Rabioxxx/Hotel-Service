package hotelproject;

import java.util.Scanner;

public class Controller {

    UserService us = new UserService();

    public void startMenu() {
        System.out.println("Welcome in the HotelApp menu.");

        while (true) {
            System.out.println("Enter a command:");

            showInstructions();

            interactionMenu(readChar());
        }
    }

    private void interactionMenu(char input) {

        switch (input){
            case 'a':
                for (Room room : us.getAllRooms()) {
                    System.out.println(room);
                }
                break;
            case 'b':
                for (Room room : us.getAllRooms()) {
                    if (!room.isOccupied()) {
                        System.out.println(room);
                    }
                }
                break;
            case 'c':
                break;
            case 'd':
                break;
            case 'x':
                break;
            default:
                System.out.println("Unknown command, please try again.");
                break;
        }
    }

    private void showInstructions() {
        System.out.println("a - Show list of all rooms.");
        System.out.println("b - Show list of unoccupied rooms.");
        System.out.println("c - Make a reservation.");
        System.out.println("d - To check-out.");
        System.out.println("x - Exit application.");
    }

    private char readChar() {
        Scanner s = new Scanner(System.in);
        return s.next().charAt(0);
    }
}
