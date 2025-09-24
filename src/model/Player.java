package model;

public class Player {
    // Attribute
    private int playerNumber;
    private String playerName;
    private String playerPosition;

    // Constructor

    public Player(String playerName, int playerNumber, String playerPosition) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
    }
    
    // methods

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{");
        sb.append("playerNumber=").append(playerNumber);
        sb.append(", playerName=").append(playerName);
        sb.append(", playerPosition=").append(playerPosition);
        sb.append('}');
        return sb.toString();
    }

}
