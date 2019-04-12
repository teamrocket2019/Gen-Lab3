import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {

    @Test
    public void dieShouldHaveAValue() {
        Die d = new Die();
        assertTrue(d.getFaceValue() >= 1 && d.getFaceValue() <= 6);
    }

}
