package RockPaperScissors;

import java.util.Scanner;

enum Gesture{
    ROCK,
    PAPER,
    SCISSORS
}

public class Player {
    public String name;
    private Gesture gesture;
    private static int trials;
    private static int draws;
    private int wins = 0;

    Player(String name){
        this.name = name;
    }

    public void selectGesture() {
        Scanner input = new Scanner(System.in);
        char gesture;
        do {
            //Get user input until user enters R, P or S
            System.out.println("Select a gesture 'R' for Rocks, 'P' for papers and 'S' for Scissors");
            gesture = input.next().toUpperCase().charAt(0);
            if (!(gesture == 'R' || gesture == 'P' || gesture == 'S')) {
                System.out.println("Wrong input!");
            }
        } while (!(gesture == 'R' || gesture == 'P' || gesture == 'S'));

        switch (gesture) {
            //Assign selected gesture to player.gesture
            case 'R' -> this.gesture = Gesture.ROCK;
            case 'P' -> this.gesture = Gesture.PAPER;
            case 'S' -> this.gesture = Gesture.SCISSORS;
        }
    }

    public void incrementWins(){
        this.wins++;
        trials++;
    }

    public static void incrementDraw() {
        draws++;
    }

    public Gesture getGesture(){
            return this.gesture;
    }

    public String toString(){
        return this.name +" : Trials: "+ trials+"| Wins: "+ this.wins+ "| Draws: "+draws;
    }
}
