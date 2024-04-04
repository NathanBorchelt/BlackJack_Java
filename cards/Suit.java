package cards;

import java.awt.Color;

public class Suit {

    private String suit;
    private Color color;

    public Suit(String suit, Color color) {
        this.suit = suit;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getSuit() {
        return suit;
    }
}
