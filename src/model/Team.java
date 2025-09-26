package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Attribute
    private static int teamCounter;
    private int teamId;
    private String teamName;
    private int leagueId;
    private List<Player> players;
    
    // Constructor
    public Team() {}

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.teamId = ++teamCounter;
    }

    // Methods
    public String getTeamName() {
        return teamName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        player.setTeamId(this.teamId);
        players.add(player);
    }

    public Player searchPlayer(int playerId) {
        // Iterate on the team list until either the player is found or there are no team left
        for(Player player: players) {
            if(player.getPlayerId() == playerId) {
                System.out.println(player);
                return player;
            }
        }
        // If player was not found the method returns a null object
        return null;
    }

    public void listPlayers() {
        var i = 1;
        for(Player player: players) {
            i++;
            System.out.println(i + ") " + player);
        }
    }

    @Override
    public String toString() {
        return "Team [teamId=" + teamId + ", teamName=" + teamName + ", leagueId=" + leagueId + "]";
    }
    
}