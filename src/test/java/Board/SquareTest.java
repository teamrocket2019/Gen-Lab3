package Board;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void aSquareShouldHaveAName(){
        Square s1 = new RegularSquare("Ceci est mon nom");
        String s2 = "Ceci est mon nom";
        assertEquals(s1.getName(), s2);
    }


}
