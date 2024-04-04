package cards;

import java.util.Random;

public class CardDeck {

    private PlayingCard topCard;
    private PlayingCard bottomCard;
    private int size;

    public CardDeck() {

        topCard = new PlayingCard();
        bottomCard = topCard;
        size = 0;
    }

    public CardDeck(int cardCount) {
        // input 52, just to declare a difference between a blank and set of cards
        if (cardCount == 52) {

            topCard = new PlayingCard();
            bottomCard = topCard;

            size = 1;

            for (String suit : CardValues.SUITS) {
                for (int i = 0; i < CardValues.NAMES.length; i++) {
                    PlayingCard nextCard = new PlayingCard(suit, CardValues.NAMES[i], CardValues.VALUES[i]);
                    addCard(nextCard);
                    size++;
                }
            }

            topCard = (PlayingCard) topCard.getNextCard();
        }
    }

    public int getSize() {
        return size;
    }

    public PlayingCard getBottomCard() {
        return bottomCard;
    }

    public PlayingCard getTopCard() {
        return topCard;
    }

    public PlayingCard drawCard() {
        if (topCard.getNextCard() != null) {
            PlayingCard temp = topCard;
            topCard = (PlayingCard) topCard.getNextCard();

            size--;
            return temp;
        }
        return null;
    }

    public void addCard(PlayingCard card) {
        bottomCard.setNextCard(card);
        bottomCard = (PlayingCard) bottomCard.getNextCard();
        size++;
    }

    public void shuffle(int times) {
        for (int i = 0; i < times; i++) {
            shuffle();
        }
    }

    public void shuffle() {
        int middle = size / 2;
        CardDeck half1 = new CardDeck();
        CardDeck half2 = new CardDeck();

        for (int i = 0; i < middle; i++) {
            half1.addCard(drawCard());
        }

        PlayingCard card;
        while ((card = drawCard()) != null) {
            half2.addCard(card);
        }

        Random random = new Random();

        while ((half1.topCard != null) && (half2.topCard != null)) {
            if (half1.topCard != null && random.nextBoolean()) {
                addCard(half1.drawCard());
            }
            if (half2.topCard != null && random.nextBoolean()) {
                addCard(half2.drawCard());
            }
        }
    }

}
