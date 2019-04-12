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
}
