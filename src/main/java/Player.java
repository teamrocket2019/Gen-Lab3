public class Player {
    private String name;
    private Piece piece;

    public Player(String playerName, String pieceName, Square start){
        name = playerName;
        piece = new Piece(pieceName, start);
    }

    public void takeTurn(Die[] d,Board b){

        int value = b.getSquares().indexOf(piece.getSquare());

        for(int i=0; i < d.length; i++) {
            d[i].roll();
            value += d[i].getFaceValue();
        }

        Square nw  = b.getSquares().get(value);
        piece.setSquare(nw);
    }

    public String getName(){
        return name;
    }

    public Piece getPiece() {
        return piece;
    }
}
