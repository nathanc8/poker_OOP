import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public static void displayDeck(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void createDeck() {
        for (Number number : Number.values()) {
            for (Color color : Color.values()) {
                Card card = new Card(color, number);
                cards.add(card);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        createDeck();
        shuffleDeck();
        return cards;
    }
}
