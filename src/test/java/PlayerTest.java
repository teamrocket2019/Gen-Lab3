import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
