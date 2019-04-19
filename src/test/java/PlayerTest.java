import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void NameTest(){
        Player p = new Player("Robel", "p1",null);

        assertEquals(p.getName(), "Robel");
    }
}
