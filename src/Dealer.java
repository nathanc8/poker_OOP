import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> playerHand;

    public Dealer(ArrayList<Card> playerHand) {
        this.playerHand = playerHand;
    }

    public Deck dealCards(int nbCardsDealed, int nbPlayers) {
        for (int i = 0; i < nbPlayers; i++) {
            ArrayList<Card> cardsDealedThisturn = new ArrayList<>();

        }
    }

    public void drawFirstCard(Deck deck) {
        ArrayList<Card> cards = deck.getCards();
        if (!cards.isEmpty()) {
            playerHand.add(cards.getFirst());
        } else {
            throw new RuntimeException("Le deck est vide !");
        }
    }

}
