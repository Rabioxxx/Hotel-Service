package hotelproject;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        UserService userService = new UserService();

        System.out.println("Witaj w aplikacji hotelowej.");

        System.out.println("Co chciałbyś zrobić?");
        System.out.println("1 - Pobierz listę wszystkich pokoi.");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                System.out.println("Wyświetlam wszystkie pokoje:");
            }
            default -> throw new IllegalStateException("Unexpected value: " + input);
        }
    }
}
