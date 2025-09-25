package model;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    // Attributes
    private List<League> leagues;
    private String zoneName;

    // Contructor
    public Zone() {}

    public Zone(String zoneName) {
        this.zoneName = zoneName;
        this.leagues = new ArrayList<>();
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

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

    public void listAll() {
        for(League league: leagues) {
            System.out.println(league);
            
        }
    }


    @Override
    public String toString() {
        return "Zone [zoneName=" + zoneName + "]";
    }

}
