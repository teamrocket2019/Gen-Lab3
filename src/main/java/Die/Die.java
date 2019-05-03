package Die;

import java.util.Random;

public class Die {
    protected int faceValue;

    public Die(){
        roll();
    }

    public void roll(){
        Random r = new Random();
        faceValue = r.nextInt(6) + 1;
    }

    public int getFaceValue(){
        return faceValue;
    }
}
