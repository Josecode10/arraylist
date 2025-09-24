package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Attribute
    private List<Player> players;
    private String teamName;
    
    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Methods
    @Override
    public String toString() {
        return "Team [players=" + players + ", teamName=" + teamName + "]";
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player findPlayer(int playerNumber) {
        // Iterate on the players list until either the player is found or there are no players left
        for(Player iterator: players) {
            if(iterator.getPlayerNumber() == playerNumber) {
                System.out.println(iterator.toString());
                return iterator;
            }
        }
        // If player was not found the method returns a null object
        return null;
    }

    public void listTeamPlayers() {
        for(Player iterator: players) {
            System.out.println("* " + iterator);
        }
    }
    
}
