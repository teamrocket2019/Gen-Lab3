public class Player {
    private String name;
    private Piece piece;

    public Player(String n, Piece p){
        name = n;
        piece = p;
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
        nw  = piece.getSquare();

        piece.setSquare(nw);


    }

    public String getName(){
        return name;
    }


}
