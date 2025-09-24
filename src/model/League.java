package model;

import java.util.ArrayList;
import java.util.List;

public class League {
    // Attributes
    private List<Team> league;
    private String leagueName;

    // Constructor
    public League(String leagueName) {
        this.leagueName = leagueName;
        this.league = new ArrayList<>();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addTeam(List<Player> players) {
        try {
            league.add(players);
        } catch (Exception e) {
            System.out.println("Error adding the team: " + e.getMessage());
        }
    }

    public void listAllTeams() {
        for(Team iterateTeams: teams) {
            for(Player iteratePlayers: players) {

            }
        }
    }



}
