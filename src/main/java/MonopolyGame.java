import java.util.LinkedList;

public class MonopolyGame {
    private Die[] dice;
    private Board board;
    private LinkedList<Player> players;

    public MonopolyGame(int nbPlayer){
        if(nbPlayer < 2 || nbPlayer > 8) throw new IllegalArgumentException("You can't play alone this game");
        dice = new Die[]{new Die(), new Die()};
        board = new Board();
        players = new LinkedList<>();
        for(int i = 0; i < nbPlayer; ++i){
            players.add(
                    new Player("Player" + i, "Piece" + i, board.getSquare(null, 0)));
        }
    }

    public void playGame(){
        for (int roundCount = 0; roundCount < 20; ++roundCount) {
            playRound(players.get(roundCount % players.size()));
        }

    }

    public void playRound(Player p){
        p.takeTurn(dice, board);
    }
}
