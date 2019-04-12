import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void ConstructionTest(){
        Board testBoard = new Board();
        assertEquals("Go", testBoard.getSquares().get(0).getName());

        for (int i = 1; i < 40; i++) {
            assertEquals("Square " + i, testBoard.getSquares().get(i).getName());
        }
    }

    @Test
    public void BoardNumberTest(){
        Board testBoard = new Board();

        assertEquals("Square 39", testBoard.getSquares().get(39).getName());
    }

    @Test
    public void BoardSquareNumTest(){
        assertEquals(40, new Board().getSquares().size());
    }
}
