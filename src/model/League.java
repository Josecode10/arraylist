package model;

import java.util.ArrayList;
import java.util.List;

public class League {
    // Attributes
    private static int leagueCounter;
    private int leagueId;
    private String leagueName;
    private int zoneId;
    private List<Team> teams;

    // Constructor
    public League() {}

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
        this.leagueId = ++leagueCounter;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void addTeam(Team team) {
        team.setLeagueId(this.leagueId);
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

    public void listTeams() {
        for(Team team: teams) {
            System.out.println(team);
        }
    }

    @Override
    public String toString() {
        return "League [leagueId=" + leagueId + ", leagueName=" + leagueName + "]";
    }

}
