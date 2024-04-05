package cards;

public class CardShoe extends CardDeck {

    private CardDeck discardDeck;

    public CardShoe(int deckCount) {
        discardDeck = new CardDeck();
        for (int i = 0; i < deckCount; i++) {
            CardDeck deckMixer = new CardDeck(52);

            deckMixer.shuffle(7);

            PlayingCard drawnCard;
            while ((drawnCard = deckMixer.drawCard()) != null) {
                addCard(drawnCard);

            }

        }

        shuffle(7);
    }

    @Override
    public PlayingCard drawCard() {
        PlayingCard drawnCard = null;
        while (drawnCard == null || new PlayingCard().equals(drawnCard)) {
            drawnCard = super.drawCard();
        }
        discardDeck.addCard(drawnCard);
        return drawnCard;

    }

}
