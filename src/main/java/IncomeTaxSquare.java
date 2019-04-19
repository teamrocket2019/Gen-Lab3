public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String n) {
        super(n);
    }

    @Override
    public void landedOn(Player player) {
        player.reduceCash(Math.min(200, player.getNetWorth() * 0.1));
    }
}
