
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void ConstructionTest(){
        Board testBoard = new Board();
        assertEquals("Go", testBoard.getSquare(null, 0).getName());

        for (int i = 1; i < 40; i++) {
            switch (i) {
                case 4:
                    assertEquals("Tax Square " + i, testBoard.getSquare(null, i).getName());
                    break;
                default:
                    assertEquals("Square " + i, testBoard.getSquare(null, i).getName());
            }

        }
    }

    @Test
    public void BoardNumberTest(){
        Board testBoard = new Board();

        assertEquals("Square 39", testBoard.getSquare(null, 39).getName());
    }

    @Test
    public void theGetSquareFonctionCanDoCircle(){
        Board testBoard = new Board();

        assertNotNull(testBoard.getSquare(null, 666));
    }
}
