package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Attribute
    private List<Player> players;
    private String teamName;
    
    // Constructor
    public Team() {}

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Methods
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
        // Iterate on the team list until either the player is found or there are no team left
        for(Player player: players) {
            if(player.getPlayerNumber() == playerNumber) {
                System.out.println(player.toString());
                return player;
            }
        }
        // If player was not found the method returns a null object
        return null;
    }

    public void listTeamPlayers() {
        var i = 1;
        for(Player player: players) {
            i++;
            System.out.println(i + ") " + player);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team{");
        sb.append("teamName=").append(teamName);
        sb.append(", players=").append(players);
        sb.append('}');
        return sb.toString();
    }

    
}