public abstract class Square {
    private String name;

    public Square(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public abstract void landedOn(Player player);
}

