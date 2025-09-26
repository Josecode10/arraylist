package view;

import java.util.Scanner;
import model.League;
import model.Player;
import model.Team;
import model.Zone;

public class App {
    public static void main(String[] args) {
        // Create scanner object
        Scanner myScanner = new Scanner(System.in);
        // Create zone object
        Zone zoneObj = new Zone();
        // Create league object
        League leagueObj = new League();
        // Create team object
        Team team = new Team();
        // Create player object
        Player player = new Player();

        var exit = false;
        while (!exit) {
            // call displayMenu method
            var option = displayMenu(myScanner);
            // call executeOption method
            exit = executeOption(option, myScanner, zoneObj, leagueObj, team, player);
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

    static boolean executeOption(int option, Scanner myScanner, Zone zoneObj, League leagueObj, Team team, Player player) {
        switch (option) {
            case 1 -> {
                System.out.println("\n--- Display leagues and teams ---\n");
                try {
                    zoneObj.listLeagues();
                } catch (Exception e) {
                    System.out.println("Error displaying leagues: " + e.getMessage());
                }
            }

            case 2 -> {
                System.out.println("\n--- Add team ---\n");
                
                System.out.print("Enter league name: ");
                var leagueName = myScanner.nextLine();

                var result = zoneObj.searchLeague(leagueName);

                if (result == null) {
                    var choice = 0;
                    System.out.print("""
                            \nThe league does not exist.
                            Do you want to create it?
                            1) Yes.
                            2) No.
                            Choose one option (1,2):\s""");
                            try {
                                choice = Integer.parseInt(myScanner.nextLine());
                            } catch (Exception e) {
                                System.out.println("Error getting response: " + e.getMessage());
                            }
                            switch (choice) {
                                case 1 -> {
                                    League league = new League(leagueName);
                                    zoneObj.addLeague(league);
                                    System.out.print("\nEnter team name: ");
                                    var teamName = myScanner.nextLine();
                                    Team newTeam = new Team(teamName);
                                    league.addTeam(newTeam);
                                    System.out.print("\nTeam has been created.\n");
                                }

                                case 2 -> {
                                    System.out.print("\nTeam has not been added to the league.\n");
                                }

                                default -> System.out.println("");
                            }

                } else {
                    System.out.print("\nEnter team name: ");
                    var teamName = myScanner.nextLine();
                    Team newTeam = new Team(teamName);
                    result.addTeam(newTeam);
                    System.out.print("\nTeam has been created.\n");
                }
            }
            
            case 3 -> {
                
            }
            
            case 4 -> {
                
            }

            case 5 -> {

            }

            case 6 -> {

            }

            case 7 -> {

            }
            
            case 8 -> {
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
