package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Draft {
    private List<Player> availablePlayers;
    private List<Team> teams;
    private int rounds;

    public Draft(List<Player> availablePlayers, List<Team> teams, int rounds) {
        // Wrap Arrays.asList() in a new ArrayList to make it modifiable
        this.availablePlayers = new ArrayList<>(availablePlayers);
        this.teams = teams;
        this.rounds = rounds;
    }

    public void startDraft() {
        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round: " + round + " of the draft: ");
            for (Team team : teams) {
                if (!availablePlayers.isEmpty()) {
                    Player draftedPlayer = availablePlayers.remove(0);
                    assignPlayerToTeam(team, draftedPlayer);
                    System.out.println(team.getTeamName() + " drafts " + draftedPlayer.getName());
                }
            }
        }
    }

    private void assignPlayerToTeam(Team team, Player player) {
        if (team == null) {
            System.out.println("Error: Team cannot be null");
            return;
        }
        if (team.getPlayer1() == null) {
            team.setPlayer1(player);
        } else if (team.getPlayer2() == null) {
            team.setPlayer2(player);
        } else if (team.getPlayer3() == null) {
            team.setPlayer3(player);
        } else {
            System.out.println("Team " + team.getTeamName() + " already has 3 players and have completed their draft - Congratulations!");
        }
    }
}
