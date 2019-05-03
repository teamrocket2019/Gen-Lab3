package Board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void ConstructionTest(){
        Board testBoard = new Board();
        assertEquals("Go", testBoard.getSquare(null, 0).getName());

        for (int i = 1; i < 40; i++) {
            switch (i) {
                case 4:
                    assertEquals("Tax Board.Square " + i, testBoard.getSquare(null, i).getName());
                    break;

                case 30:
                    assertEquals("Go to Jail " + i, testBoard.getSquare(null,i).getName());
                    break;

                default:
                    assertEquals("Regular Board.Square " + i, testBoard.getSquare(null, i).getName());
            }

        }
    }

    @ParameterizedTest
    @ValueSource(ints = 39)
    public void BoardNumberTest(int i){
        Board testBoard = new Board();

        assertEquals("Regular Board.Square 39", testBoard.getSquare(null, i).getName());
    }

    @Test
    public void theGetSquareFonctionCanDoCircle(){
        Board testBoard = new Board();

        assertNotNull(testBoard.getSquare(null, 666));
    }
}
