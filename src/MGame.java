import java.util.Arrays;

public class MGame {
    public static  Die[] dices ;
    public static Board board ;
    private int roundCat ;
    public static int N = 20 ;


    private Player[] players ;


    public MGame(Player[] players) {
        roundCat = 0 ;
        dices = new Die[]{new Die(),new Die()} ;
        this.players  = players ;
        board = new Board();
    }
    public MGame(Player[] players, int roundNum){
        roundCat = 0 ;
        dices = new Die[]{new Die(),new Die()} ;
        this.players  = players ;
        board = new Board();
        N = roundNum ;
    }

    public void playGame(){
        for(roundCat = 1 ; roundCat <= N ; roundCat++) {
            System.out.println("------------- Round " + roundCat + " -------------");
            playRound();
        }
    }

    private void playRound(){
        for (int i = 0 ; i < players.length ; i++ ){
            players[i].takeTurn();
        }
    }
}
