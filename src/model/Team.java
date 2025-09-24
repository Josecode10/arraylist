package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Attribute
    private List<Player> team;
    private String teamName;
    
    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new ArrayList<>();
    }

    // Methods
    @Override
    public String toString() {
        return "Team [team=" + team + ", teamName=" + teamName + "]";
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        team.add(player);
    }

    public Player findPlayer(int playerNumber) {
        // Iterate on the team list until either the player is found or there are no team left
        for(Player player: team) {
            if(player.getPlayerNumber() == playerNumber) {
                System.out.println(player.toString());
                return player;
            }
        }
        // If player was not found the method returns a null object
        return null;
    }

    public void listTeamteam() {
        for(Player player: team) {
            System.out.println("* " + player);
        }
    }
    
}
