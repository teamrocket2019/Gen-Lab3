import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    @Test
    public void initTest(){
        Square go = new GoSquare("Go");
        Piece test = new Piece("Hat", go);
        assertEquals(test.getName(), "Hat");

        assertEquals(test.getSquare().getName(), "Go");
    }

    @Test
    public void changeSquare() {
        Piece test = new Piece("Dog", new RegularSquare("Square 4"));
        test.setSquare(new RegularSquare("Square 5"));

        assertEquals(test.getSquare().getName(), "Square 5");
    }
}
