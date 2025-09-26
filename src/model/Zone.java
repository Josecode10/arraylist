package model;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    // Attributes
    private static List<League> leagues = new ArrayList<>();
    // private static int zoneCounter;
    // private int zoneID;
    // private String zoneName;
    // private List<League> leagues;

    // Contructor
    // public Zone() {}

    // public Zone(String zoneName) {
    //     this.zoneName = zoneName;
    //     this.leagues = new ArrayList<>();
    //     this.zoneID = ++zoneCounter;
    // }

    // Methods
    // public int getZoneID() {
    //     return zoneID;
    // }
    
    // public String getZoneName() {
    //     return zoneName;
    // }
    
    // public void setZoneName(String zoneName) {
    //     this.zoneName = zoneName;
    // }
    
    public void addLeague(League league) {
        leagues.add(league);
    }

    public League searchLeague(String leagueName) {
        for(League league: leagues) {
            if (league.getLeagueName().equalsIgnoreCase(leagueName)) {
                return league;
            }
        }
        return null;
    }

    public void listLeagues() {
        for(League league: leagues) {
            System.out.println(league + "\n");
            league.listTeams();
        }
    }
}
