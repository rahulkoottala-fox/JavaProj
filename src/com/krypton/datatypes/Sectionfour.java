package com.krypton.datatypes;

public class Sectionfour {

    public static void main( String[] args){
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(score,levelCompleted,bonus);
        System.out.println("The final score in main method is " + finalScore);
    }

    public static int calculateScore(int score, int levelCompleted, int bonus){
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("The final score is " + finalScore);
        return finalScore;
    }

    // -1 is used to show errror. Hence sometimes it is used to return in a false state.
}
