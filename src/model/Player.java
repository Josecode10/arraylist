package model;

public class Player {
    // Attribute
    private static int playerCounter;
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String playerPosition;
    private int teamId;

    // Constructor

    public Player(String playerName, int jerseyNumber, String playerPosition) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.playerPosition = playerPosition;
        this.playerId = ++playerCounter;
    }
    
    // methods
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
                + ", playerPosition=" + playerPosition + ", teamId=" + teamId + "]";
    }

}
