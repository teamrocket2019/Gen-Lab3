import java.util.LinkedList;

public class Board {
    private LinkedList<Square> squares;

    public Board(){
        squares = new LinkedList<>();

        squares.add(new Square("Go"));
        for(int i = 1; i < 40; i ++){
            squares.add(new Square("Square "+ i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        int i = 0;
        for(Square sq : squares){
            if(sq.equals(oldLoc)) break;
            ++i;
        }
        return squares.get((i + fvTot) % squares.size());
    }
}
