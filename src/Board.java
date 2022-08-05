public class Board {
    Square[] squares ;
    public Board() {
        squares = new Square[40] ;
        for (int i = 0; i < 40; i++) {
            squares[i] = new Square("L"+i) ;
        }
    }
    public Square getSquares(Square oldLoc, int fvTot) {
        for (int i = 0; i < squares.length; i++) {
            if(squares[i].getName().equals(oldLoc.getName())){
                if(i+fvTot >= 40){
                    return squares[i+fvTot-40] ;
                }
                else {
                    return squares[i+fvTot] ;
                }
            }
        }
        return oldLoc ;
    }
}
