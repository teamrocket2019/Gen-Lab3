public class Player {
    private String name;
    private Piece piece;

    public Player(String playerName, String pieceName, Square start){
        name = playerName;
        piece = new Piece(pieceName, start);
    }

    public void takeTurn(Die[] d,Board b){

        Square oldLoc = piece.getSquare();
        int fvTot = 0;

        for(int i=0; i < d.length; i++) {
            d[i].roll();
            fvTot += d[i].getFaceValue();
        }

        piece.setSquare(b.getSquare(oldLoc,fvTot));
    }

    public String getName(){
        return name;
    }

    public Piece getPiece() {
        return piece;
    }
}
