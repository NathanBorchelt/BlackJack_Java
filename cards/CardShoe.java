package cards;

public class CardShoe {

    private CardDeck shoeDeck;
    private CardDeck drawnCards;
    private int remaining;

    public CardShoe(int deckCount) {
        shoeDeck = new CardDeck();
        for (int i = 0; i < deckCount; i++) {
            CardDeck deckMixer = new CardDeck(52);

            deckMixer.shuffle(7);

            PlayingCard drawnCard;
            while ((drawnCard = deckMixer.drawCard()) != null) {
                shoeDeck.addCard(drawnCard);
                remaining++;
            }

        }

        shoeDeck.shuffle(7);
    }
}
