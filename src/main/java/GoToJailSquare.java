public class GoToJailSquare extends Square {
    Square jail;

    public GoToJailSquare(String n, Square jail) {
        super(n);
        this.jail = jail;
    }

    @Override
    public void landedOn(Player player) {
        player.setLocation(jail);
    }
}
