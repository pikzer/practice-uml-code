public class Player {
    private String name ;
    private Piece piece ;

    public Player(String name){
        this.name = name ;
        piece = new Piece() ;
    }

    public void takeTurn(){
        int fv = 0 ;
        for (int i = 0; i < 2; i++) {
            MGame.dices[i].roll();
            fv += MGame.dices[i].getFaceValue() ;
        }
        System.out.println("Player: " + name + " roll dice = " + fv);
        Square oldLoc = piece.getLocation() ;
        System.out.print("Move from " + oldLoc.getName());
        Square newLoc = MGame.board.getSquares(oldLoc,fv);
        System.out.println(" to " + newLoc.getName());
        piece.setLocation(newLoc);
    }
}
