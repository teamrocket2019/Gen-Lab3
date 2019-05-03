package Board;

import java.util.LinkedList;

public class Board {
    private LinkedList<Square> squares;

    public Board(){
        squares = new LinkedList<>();

        squares.add(new GoSquare("Go"));
        for(int i = 1; i < 40; i ++){
            switch (i) {
                case 4:
                    squares.add(new IncomeTaxSquare("Tax Board.Square " + i));
                    break;

                case 30:
                    squares.add(new GoToJailSquare("Go to Jail " + i, squares.get(10)));
                    break;

                default:
                    squares.add(new RegularSquare("Regular Board.Square "+ i));
            }

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
