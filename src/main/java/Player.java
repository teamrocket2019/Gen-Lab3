public class Player {
    private String name;
    private Piece piece;
    private int cash;


    public Player(String playerName, String pieceName, Square start){
        name = playerName;
        piece = new Piece(pieceName, start);
        cash = 1500;
    }

    public void takeTurn(Die[] d,Board b){

        Square oldLoc = piece.getSquare();
        int fvTot = 0;

        for(int i=0; i < d.length; i++) {
            d[i].roll();
            fvTot += d[i].getFaceValue();
        }
        System.out.println(name + " rolled a " + d[0].getFaceValue() + " and a " + d[1].getFaceValue());

        setLocation(b.getSquare(oldLoc,fvTot));

    System.out.println(name + " arrived on " + piece.getSquare().getName() + " and possesses " +
            cash);
    }

    public String getName(){
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getNetWorth(){
        return cash;
    }

    public void addCash(int cash){
        this.cash += cash;
    }

    public void reduceCash(int cash){
        this.cash -= cash;
    }

    public void setLocation(Square s){
        piece.setSquare(s);
        piece.getSquare().landedOn(this);
    }

    public Square getLocation() {
        return piece.getSquare();
    }
}
