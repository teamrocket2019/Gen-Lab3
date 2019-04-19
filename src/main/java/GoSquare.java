public class GoSquare extends Square{
    public GoSquare(String n) {
        super(n);
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
