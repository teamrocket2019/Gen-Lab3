import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class MonopolyGameTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 8})
    public void aMonopolyGameShouldBePlayed(int nbPlayer) {
        MonopolyGame mg = new MonopolyGame(nbPlayer);
        mg.playGame();
    }

    @Test
    public void aMonopolyCannotBePlayedAlone(){
        assertNotNull(new MonopolyGame(8));
        assertThrows(IllegalArgumentException.class,  () -> {
            new MonopolyGame(1);
        });
    }

    @Test
    public void aMonopolyCannotBePlayedIfYouAreMoreThanEight(){
        assertNotNull(new MonopolyGame(2));
        assertThrows(IllegalArgumentException.class,  () -> {
            new MonopolyGame(9);
        });
    }
}
