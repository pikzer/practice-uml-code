public class Piece {
    private Square location ;
    public Piece() {
        // Start Location on board.
        location = new Square("L0") ;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
