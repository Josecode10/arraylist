package view;

import java.util.Scanner;

import model.League;
import model.Team;

public class App {
    public static void main(String[] args) {
        // Create scanner object
        Scanner myScanner = new Scanner(System.in);

        var salir = false;
        while (!salir) {
            // call displayMenu method
            var option = displayMenu(myScanner);
            // call executeOption method
            executeOption(option, myScanner);
        }

    }

    static int displayMenu(Scanner myScanner) {
        // Print menu
        System.out.print("""
            Menu:
            1) Display available leagues.
            3) Display teams of all leagues.
            4) Choose league and display team info.
            2) Create team.
            3) Display teams.
            4) Search team.
            5) Add player.
            6) Exit.
            Choose one option:\s""");
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
                System.out.println("""
                    --- Available leagues ---
                    1) Spanish League 'La Liga'
                    2) Dutch League 'Eredivisie'
                    3) German League 'Bundesliga'
                    4) Italian League 'Serie A
                    5) English League 'Premier League'\n""");
            }

            case 2 -> {
                System.out.println("--- Create team ---");
                League chosenLeague = searchLeague(myScanner);
                System.out.print("Enter team name: ");
                var teamName = myScanner.nextLine();
                
                var teamObj = new Team();

                if(chosenLeague.searchTeam(teamName) != null) {
                    System.out.println("\nThe team " + teamName + " already exist.\n") ;
                } else {
                    teamObj.setTeamName(teamName);
                    chosenLeague.addTeam(teamObj);
                    System.out.println("\nthe team has been added to the league.\n");
                }
            }

            case 3 -> {
                

            }

            case 4 -> {

            }

            case 5 -> {
                System.out.println("Have a nice day!");
                myScanner.close();

            }

            case 6 -> {}
                
            default -> System.out.println("");
        }
    }

    static League searchLeague(Scanner myScanner) {
        // Load leagues
        League leagueOne = new League("Spanish League 'La Liga'");
        League leagueTwo = new League("Dutch League 'Eredivisie'");
        League leagueThree = new League("German League 'Bundesliga'");
        League leagueFour = new League("Italian League 'Serie A");
        League leagueFive = new League("English League 'Premier League'");

        // Display league menu
        var choice = 0;
        System.out.print("""
                \nWhat league do you want to add the team to?
                1) Spanish League 'La Liga'
                2) Dutch League 'Eredivisie'
                3) German League 'Bundesliga'
                4) Italian League 'Serie A
                5) English League 'Premier League'
                Choose a league:\s""");
                try {
                    choice = Integer.parseInt(myScanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Error entering choice: " + e.getMessage());
                }

        switch (choice) {
            case 1 -> {
                System.out.println("\nYou have chosen " + leagueOne + "\n");
                return leagueOne;
            }
            case 2 -> {
                System.out.println("\nYou have chosen " + leagueTwo + "\n");
                return leagueTwo;
            }
            case 3 -> {
                System.out.println("\nYou have chosen " + leagueThree + "\n");
                return leagueThree;
            }
            case 4 -> {
                System.out.println("\nYou have chosen " + leagueFour + "\n");
                return leagueFour;
            }
            case 5 -> {
                System.out.println("\nYou have chosen " + leagueFive + "\n");
                return leagueFive;
            }
            default -> {
                System.out.println("");
                return null;
            }
        }
    }

}
