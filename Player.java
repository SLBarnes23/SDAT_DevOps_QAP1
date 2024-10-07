package com.keyin;

public class Player {
    private String name;
    private int age;
    private String position;
    private int homeRuns;
    private int stolenBases;
    private double onBasePercentage;

    public Player(String name, String position, int age, int homeRuns, int stolenBases, double onBasePercentage) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.homeRuns = homeRuns;
        this.stolenBases = stolenBases;
        this.onBasePercentage = onBasePercentage;
    }
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getStats(){
        return "Player: " + name + " | Age: " + age + " | Position: " + position +
                "| Homeruns: " + homeRuns + "Stolen Bases: " + stolenBases + "On Base Percentage: " + onBasePercentage;
    }
}
