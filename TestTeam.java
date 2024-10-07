package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestTeam {

    @Test
    void testTeamAssignment() {
        Team team = new Team("Alpha Team");
        Player player1 = new Player("Player1", "Pitcher", 25, 15, 10, 0.350);
        Player player2 = new Player("Player2", "Catcher", 27, 5, 0, 0.280);

        team.setPlayer1(player1);
        team.setPlayer2(player2);

        assertEquals(player1, team.getPlayer1());
        assertEquals(player2, team.getPlayer2());
    }
}
