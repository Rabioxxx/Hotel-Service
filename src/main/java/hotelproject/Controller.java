package hotelproject;

import java.util.Scanner;

public class Controller {
    private UserService userService = new UserService();

    public void startMenu() {
        System.out.println("Welcome in the HotelApp menu.");

        while (true) {
            System.out.println("Enter a command:");

            interactionMenu();

            char input = readChar();

            switch (input){
                case 'a':
                    break;
                default:
                    System.out.println("Unknown command, please try again.");
                    break;
            }
        }
    }

    private void interactionMenu() {
        System.out.println("a - Show list of all rooms.");
        System.out.println("b - Show list of unoccupied rooms.");
        System.out.println("c - Make a reservation.");
        System.out.println("d - To check-out.");
    }

    private char readChar() {
        Scanner s = new Scanner(System.in);
        return s.next().charAt(0);
    }
}
