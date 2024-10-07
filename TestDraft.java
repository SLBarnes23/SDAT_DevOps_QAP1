package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class TestDraft {

    @Test
    void testDraftProcess() {
        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        Player p1 = new Player("Player1", "Pitcher", 25, 15, 10, 0.350);
        Player p2 = new Player("Player2", "Catcher", 27, 5, 0, 0.280);
        Player p3 = new Player("Player3", "Shortstop", 22, 18, 6, 0.300);

        Draft draft = new Draft(Arrays.asList(p1, p2, p3), Arrays.asList(team1, team2), 2);
        draft.startDraft();

        // Ensure that each team has been assigned players correctly
        assertEquals(p1, team1.getPlayer1());
        assertEquals(p2, team2.getPlayer1());
    }
}
