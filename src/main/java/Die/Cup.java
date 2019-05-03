package Die;

public class Cup {
    Die die1;
    Die die2;

    public Cup(Die d1, Die d2){
        die1 = d1;
        die2 = d2;
    }


    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int getTotal() {
        return die1.getFaceValue() + die2.getFaceValue();
    }
}
