package Board;
import Player.*;


public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String n) {
        super(n);
    }

    @Override
    public void landedOn(Player player) {
        player.reduceCash((int) Math.round(Math.max(200, player.getNetWorth() * 0.1)));
    }
}
