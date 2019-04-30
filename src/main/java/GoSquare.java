public class GoSquare extends Square{
    int goCash = 200;

    public GoSquare(String n) {
        super(n);
    }

    public int getGoCash() {
        return goCash;
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(goCash);
    }
}
