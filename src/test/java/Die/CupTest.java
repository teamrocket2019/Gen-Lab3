package Die;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupTest {
    static int counter = 1;

    @RepeatedTest(5)
    void CupOnTest() {
        LoadedDie d1 = new LoadedDie();
        LoadedDie d2 = new LoadedDie();

        Cup cup = new Cup(d1,d2);
        assertEquals(12, cup.getTotal());
    }

    @BeforeEach
    public void initEach(){
        System.out.println("Test Die.Cup number " + counter++);
    }
}
