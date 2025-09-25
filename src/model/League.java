package model;

import java.util.ArrayList;
import java.util.List;

public class League {
    // Attributes
    private List<Team> teams;
    private String leagueName;

    // Constructor
    public League() {}

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public Team searchTeam(String teamName) {
        for(Team team: teams) {
            if (team.getTeamName().equalsIgnoreCase(teamName)) {
                return team;
            }
        }
        return null;
    }

    public void listAllTeams() {
        var i = 1;
        for(Team team: teams) {
            System.out.println(i + ") " + team);
            i++;
        }
    }

    public void listAllTeamAndPlayers() {
        var i = 1;
        for(Team team: teams) {
            System.out.println(i + ") " + team.getTeamName());
            i++;
            team.listTeamPlayers();
        }
    }

    @Override
    public String toString() {
        return "League [leagueName=" + leagueName + "]";
    }

}
