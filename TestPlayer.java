package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestPlayer {

    @Test
    void testPlayerCreation() {
        Player player = new Player("Test Player", "Pitcher", 25, 15, 10, 0.350);
        assertEquals("Test Player", player.getName());
        assertEquals("Pitcher", player.getPosition());
        assertEquals("Player: Test Player | Age: 25 | Position: Pitcher| Homeruns: 15Stolen Bases: 10On Base Percentage: 0.35", player.getStats());
    }
}