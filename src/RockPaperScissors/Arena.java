package RockPaperScissors;

public class Arena {
    Player player1;
    Player player2;

    Arena(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void processGame(){
        player1.selectGesture();
        player2.selectGesture();
        if (player1.getGesture() == Gesture.ROCK & player2.getGesture() == Gesture.SCISSORS){
            player1.incrementWins();
            System.out.println(player1.getGesture() +" beats " +player2.getGesture() +" "+player1.name + " Wins!");
        }
        else if (player1.getGesture() == Gesture.PAPER & player2.getGesture() == Gesture.ROCK){
            player1.incrementWins();
            System.out.println(player1.getGesture() +" beats " +player2.getGesture() +" "+player1.name + " Wins!");
        }
        else if (player1.getGesture() == Gesture.SCISSORS & player2.getGesture() == Gesture.ROCK){
            player1.incrementWins();
            System.out.println(player1.getGesture() +" beats " +player2.getGesture() +" "+player1.name + " Wins!");
        }
        else if (player1.getGesture() == player2.getGesture()){
            Player.incrementDraw();
            System.out.println("Draw!");
        }
        else{
            player2.incrementWins();
            System.out.println(player2.getGesture() +" beats " +player1.getGesture() +" "+player2.name + " Wins!");
        }
    }

    public void showInfo(){
        System.out.println(player1);
        System.out.println(player2);
    }
}
