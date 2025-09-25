package view;

import java.util.Scanner;
import model.League;
import model.Zone;

public class App {
    public static void main(String[] args) {
        // Create scanner object
        Scanner myScanner = new Scanner(System.in);
        // Load zone
        Zone newZone = new  Zone("Europe");
        // Load leagues
        League leagueOne = new League("Spanish League 'La Liga'");
        League leagueTwo = new League("Dutch League 'Eredivisie'");
        League leagueThree = new League("German League 'Bundesliga'");
        League leagueFour = new League("Italian League 'Serie A");
        League leagueFive = new League("English League 'Premier League'");
        // Add leagues to the zone
        newZone.addLeague(leagueOne);
        newZone.addLeague(leagueTwo);
        newZone.addLeague(leagueThree);
        newZone.addLeague(leagueFour);
        newZone.addLeague(leagueFive);

        var exit = false;
        while (!exit) {
            // call displayMenu method
            var option = displayMenu(myScanner);
            // call executeOption method
            exit = executeOption(option, myScanner);
        }

    }

    static int displayMenu(Scanner myScanner) {
        // Print menu
        System.out.print("""
            Menu:
            1) Display leagues and teams.
            2) Add team.
            3) Edit team.
            4) Remove team.
            5) Add player.
            6) Edit player.
            7) Remove player.
            8) Exit.
            Choose one option:\s""");

        try {
            return Integer.parseInt(myScanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error entering option: " + e.getMessage());
            return 0;
        }
    }

    static boolean executeOption(int option, Scanner myScanner) {
        switch (option) {
            case 1 -> {

            }

            case 2 -> {
                
            }
            
            case 3 -> {
                
            }
            
            case 4 -> {
                
            }
            
            case 5 -> {
                System.out.println("\nHave a nice day!");
                return true;
            }
            
            default -> {
                System.out.println("");
            }
        }
        return false;
    }

}
