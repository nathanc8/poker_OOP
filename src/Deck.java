import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        createDeck();
        shuffleDeck();
    }

    public static void displayDeck(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void createDeck() {
        for (Color color : Color.values()) {
            for (Number number : Number.values()) {
                Card card = new Card(color, number);
                cards.add(card);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
