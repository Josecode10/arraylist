package view;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner myScanner = new Scanner(System.in);
        // call displayMenu method
        // var option = displayMenu(myScanner);
        // call executeOption method



    }

    static int displayMenu(Scanner myScanner) {
        // Print menu
        System.out.println("""
            Choose one option
            1) Create team.
            2) Add player.
            3) Display team
            4) Exit:\s""");
        try {
            return Integer.parseInt(myScanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error entering option: " + e.getMessage());
            return 0;
        }
    }

    static void executeOption(int option, Scanner myScanner) {
        switch (option) {
            case 1 -> {
                System.out.println("--- Create team ---");
                System.out.print("Enter team's name: ");
                var teamName = myScanner.nextLine();
            }

            case 2 -> {
                

            }

            case 3 -> {

            }

            case 4 -> System.out.println("Have a nice day!");
                
            default -> System.out.println("");
        }
    }

}
