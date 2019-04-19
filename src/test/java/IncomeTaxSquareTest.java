import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @Test
    void landedOnTest() {
        Board board = new Board();
        Player player = new Player("Yoann", "Shoe", board.getSquare(null, 0));

        player.setLocation(board.getSquare(player.getLocation(), 4));

        assertEquals(1350, player.getNetWorth());
    }
}