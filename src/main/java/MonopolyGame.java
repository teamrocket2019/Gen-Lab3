import java.util.LinkedList;

public class MonopolyGame {
    private Die d1;
    private Die d2;
    private Board board;
    private LinkedList<Player> players;

    public MonopolyGame(){
        d1 = new Die();
        d2 = new Die();
        board = new Board();
        players = new LinkedList<>();
    }
}
