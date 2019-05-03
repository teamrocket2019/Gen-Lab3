package Die;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {

    @RepeatedTest(12)
    public void dieShouldHaveAValue() {
        Die d = new Die();
        assertTrue(d.getFaceValue() >= 1 && d.getFaceValue() <= 6);
    }

    @RepeatedTest(12)
    public void dieShouldRollFine(){
        Die d = new Die();
        d.roll();
        assertTrue(d.getFaceValue() >= 1 && d.getFaceValue() <= 6);
    }
}
