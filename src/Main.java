import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int numPlayer;
        String roundPlay ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number of player: ");
        numPlayer = Integer.parseInt(scanner.nextLine()) ;
        if(numPlayer < 2){
            return;
        }
        Player[] players ;
        players = new Player[numPlayer] ;
        System.out.println("Insert player name...");
        for (int i = 0; i < numPlayer; i++) {
            System.out.print("player"+i+": ");
            String temp = scanner.nextLine() ;
            if(temp.equals("")){
                players[i] = new Player("player"+i+": ") ;
            }
            else{
                players[i] = new Player(temp) ;
            }
        }
        System.out.println("Number of round to play?(d = default)...");
        Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
        roundPlay = scanner.nextLine() ;
        new MGame(players) ;
        if(roundPlay.equalsIgnoreCase("d")){
            new MGame(players).playGame();
        }
        else if(pattern.matcher(roundPlay).matches()){
            new MGame(players,Integer.parseInt(roundPlay)).playGame(); ;
        }
    }
}
