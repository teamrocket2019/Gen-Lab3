package Board;

import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @Test
    void landedOnTest() {
        Square square = new RegularSquare("test");
        GoSquare go = new GoSquare("Go");
        Player player = new Player("Yoann", "Boat", square);

        int beforeCash = player.getNetWorth();
        player.setLocation(go);
        int afterCash = player.getNetWorth();

        assertEquals(beforeCash + go.getGoCash(), afterCash);
    }
}