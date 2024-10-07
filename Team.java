package com.keyin;

public class Team {
    private String teamName;
    private Player player1;
    private Player player2;
    private Player player3;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    // Get individual players
    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getPlayer3() {
        return player3;
    }


    // set individual players
    public void setPlayer1(Player player) {
        this.player1 = player;
    }

    public void setPlayer2(Player player) {
        this.player2 = player;
    }

    public void setPlayer3(Player player) {
        this.player3 = player;
    }

    // print team stats
    public void displayTeamStats() {
        System.out.println("Team: " + teamName);
        if (player1 != null) {
            System.out.println(player1.getStats());
        }
        if (player2 != null) {
            System.out.println(player2.getStats());
        }
        if (player3 != null) {
            System.out.println(player3.getStats());
        }
    }
}
