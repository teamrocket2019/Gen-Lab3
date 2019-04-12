public class Player {
    private String name;
    private Piece piece;

    public Player(String n, Board b){
        name = n;
        piece = new Piece("test", null);
        
    }

    public void takeTurn(Die[] d,Board b){

        int value = 0;
        Square old;
        Square nw;

        for(int i=0; i < d.length; i++) {
            d[i].roll();
            value += d[i].getFaceValue();
        }

        old = piece.getSquare();
        nw  = b.getSquares().get(value);

        piece.setSquare(nw);


    }

    public String getName(){
        return name;
    }


}
