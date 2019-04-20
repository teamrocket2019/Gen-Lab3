import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    void landedOnTest() {
        Square square = new RegularSquare("test");
        Square jail = new RegularSquare("Jail");
        Square gtj = new GoToJailSquare("gtj", jail);

        Player player = new Player("Yoann", "Car", square);
        player.setLocation(gtj);

        assertSame(jail, player.getLocation());
    }
}