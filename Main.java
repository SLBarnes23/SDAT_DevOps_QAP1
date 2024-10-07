package com.keyin;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter the team names
        System.out.print("Enter the name of the First Team: ");
        String teamName1 = scanner.nextLine(); //Capture input
            // Create the first team using the provided name
            Team team1 = new Team(teamName1);

        System.out.print("Enter the name of the Second Team: ");
        String teamName2 = scanner.nextLine(); //Capture input
            // Create the second team using the provided name
            Team team2 = new Team(teamName2);

        System.out.print("Enter the name of the Third Team: ");
        String teamName3 = scanner.nextLine(); //Capture input
             // Create the third team using the provided name
             Team team3 = new Team(teamName3);

        // Create players
        Player p1 = new Player("Ronnie Painter", "Center field", 16, 19, 55, 0.320);
        Player p2 = new Player("Bubba Tubbs", "Catcher", 20, 22, 0, 0.315 );
        Player p3 = new Player("Aaron Booten", "First base", 18, 7, 66, 0.399);
        Player p4 = new Player("Bort Bortles", "Left Field", 40, 63, 0, .200);
        Player p5 = new Player("Boog Peterson", "Right field", 22, 50, 0, .410);
        Player p6 = new Player("Photmon Dants", "Pinch runner", 20, 0, 86, .500 );
        Player p7 = new Player("Topher Dee", "Shortstop", 21, 21, 25, .362);
        Player p8 = new Player("Tom Delahunty", "Second base", 21, 29, 30, .380);
        Player p9 = new Player("Dan Orlach", "Third base", 20, 36, 40, .401 );

        //close scanner
        scanner.close();

        //Create Draft
        Draft draft = new Draft(
                Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9), //Available players
                Arrays.asList(team1, team2, team3), // Teams in draft
                3 //number of rounds
        );

        //Start Draft
        draft.startDraft();

        // Display team stats after the draft
        System.out.println("\nDraft Completed! Here are the teams: ");
        team1.displayTeamStats();
        team2.displayTeamStats();
        team3.displayTeamStats();

    }
    }

