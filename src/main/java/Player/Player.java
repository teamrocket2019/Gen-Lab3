package Player;

import Board.*;
import Die.*;

public class Player {
    private String name;
    private Piece piece;
    private int cash;


    public Player(String playerName, String pieceName, Square start){
        name = playerName;
        piece = new Piece(pieceName, start);
        cash = 1500;
    }

    public void takeTurn(Cup c, Board b){

        Square oldLoc = piece.getSquare();
        c.roll();

        System.out.println(name + " rolled a " + c.getTotal());

        setLocation(b.getSquare(oldLoc,c.getTotal()));

    System.out.println(name + " arrived on " + piece.getSquare().getName() + " and possesses " +
            cash);
    }

    public String getName(){
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getNetWorth(){
        return cash;
    }

    public void addCash(int cash){
        this.cash += cash;
    }

    public void reduceCash(int cash){
        this.cash -= cash;
    }

    public void setLocation(Square s){
        piece.setSquare(s);
        piece.getSquare().landedOn(this);
    }

    public Square getLocation() {
        return piece.getSquare();
    }
}
