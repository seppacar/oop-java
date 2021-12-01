package RockPaperScissors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name of the player one");
        Player player1 = new Player(input.next()); //Create player 1 object
        System.out.println("Please enter name of the player two");
        Player player2 = new Player(input.next()); //Create player 2 object

        Arena arena = new Arena(player1, player2); //Create an Arena object and add players to the arena

        int check;

        do{
            System.out.println("Enter '1' to start a new round, '2' to show score and -1' to end game");
            check = input.nextInt();
            switch (check){
                case -1:
                    System.out.println("Game over");
                    arena.showInfo();
                    break;
                case 1:
                    arena.processGame();
                case 2:
                    arena.showInfo();
            }
        }while(check != -1);



    }
}
