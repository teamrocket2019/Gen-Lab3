package Player;

import Board.Square;

public class Piece {
    private String name;
    private Square square;

    public Piece(String n, Square s){
        name = n;
        square = s;
    }

    public String getName() {
        return name;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}