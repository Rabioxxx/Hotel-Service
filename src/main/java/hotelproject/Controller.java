package hotelproject;

import java.util.Scanner;

public class Controller {
    private UserService userService = new UserService();

    public void startMenu() {
        System.out.println("Welcome in the HotelApp menu.");
        System.out.println("What would you like to do?");
    }
}
