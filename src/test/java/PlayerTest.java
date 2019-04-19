import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PlayerTest {

    @Test
    public void nameTest(){
        Player p = new Player("Robel", "p1",null);

        assertEquals(p.getName(), "Robel");
    }

    @Test
    public void turnTest() {
        Board b = new Board();

        Player player = new Player("Yoann", "TopHat", b.getSquare(null, 0));

        Die dieList[] = {new LoadedDie(), new LoadedDie()};

        player.takeTurn(dieList,b);

        assertEquals("Square 12", player.getPiece().getSquare().getName());
    }

    @Test
    public void aPlayerShouldBeginTheGameWith1500Dollars(){
        Board b = new Board();
        Player p = new Player("Julien", "Piece", b.getSquare(null, 0));
        assertEquals(1500, p.getNetWorth());
    }

    @Test
    public void aPlayerShouldLooseDollarInTheGame(){
        Board b = new Board();
        Player p = new Player("Julien", "Piece", b.getSquare(null, 0));
        p.reduceCash(200);
        assertEquals(1300, p.getNetWorth());
    }

    @Test
    public void aPlayerShouldGainDollarInTheGame(){
        Board b = new Board();
        Player p = new Player("Julien", "Piece", b.getSquare(null, 0));
        p.addCash(200);
        assertEquals(1700, p.getNetWorth());
    }

    @Test
    public void aPlayerShouldBeAbleToChangeTheLocationOfTheirPiece(){
        Board b = new Board();
        Player p = new  Player("Hagoromo Lala", "Rocket", b.getSquare(null, 0));
        p.setLocation(b.getSquare(null, 20));
        assertSame(b.getSquare(null, 20), p.getPiece().getSquare());
    }
}
