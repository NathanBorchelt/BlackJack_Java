package cards;

import java.awt.Color;
import java.util.Objects;

public class PlayingCard implements Card {

    private String suit;
    private int value;
    private String name;
    private Card nextCard;

    public PlayingCard() {
        suit = null;
        name = null;
        value = 0;
        nextCard = null;
    }

    public PlayingCard(String suit, String cardName, int value) {

        this.suit = suit;
        this.name = cardName;
        this.value = value;
        nextCard = null;
    }

    public void addCard(PlayingCard card) {
        if (nextCard == null) {
            nextCard = card;
            return;
        }
        ((PlayingCard) nextCard).addCard(card);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    public Suit getSuit() {

        return new Suit(suit, getSuitColor());

        /*
         * return new Suit(suit,
         * (suit.equals(CardValues.DIAMOND) ? CardValues.RED_CARD
         * : (suit.equals(CardValues.HEART) ? CardValues.RED_CARD
         * : (suit.equals(CardValues.SPADES) ? CardValues.BLACK_CARD
         * : (suit.equals(CardValues.CLUBS) ? CardValues.BLACK_CARD : Color.GRAY)))));
         */
    }

    public String getSuitName() {
        return suit;
    }

    public Color getSuitColor() {
        switch (suit) {
            case CardValues.DIAMOND:
            case CardValues.HEART:
                return CardValues.RED_CARD;

            case CardValues.CLUBS:
            case CardValues.SPADES:
                return CardValues.BLACK_CARD;

            default:
                return Color.GRAY;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, suit, value);
    }

    @Override
    public boolean equals(Object card) {
        if (card instanceof PlayingCard) {
            PlayingCard playingCard = (PlayingCard) card;

            return (name.equals(playingCard.getName()) && suit.equals(playingCard.getSuitName())
                    && getValue() == playingCard.getValue());
        }
        return false;

    }

    @Override
    public String toString() {
        return String.format("%s of %s", name, suit);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public boolean hasNext() {
        return (nextCard != null);
    }

    public Card getNextCard() {
        return nextCard;
    }

    public void setNextCard(Card nextCard) {
        this.nextCard = nextCard;
    }

}
