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

    public void addTeam(Team team) {
        league.add(team);
    }

    public void listAllTeams() {
        for(Team team: league) {
            System.out.println("Team name: " + team);
        }
    }

    public void listAllTeamAndPlayers() {
        for(Team team: league) {
            for(Player player: team)
        }
    }



}
