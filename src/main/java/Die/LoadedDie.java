package Die;

import Die.Die;

public class LoadedDie extends Die {
    public LoadedDie() {
        super();
    }

    @Override
    public void roll() {
        faceValue = 6;
    }
}
