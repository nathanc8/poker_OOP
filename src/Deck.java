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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getDeckSize() {
        return this.cards.size();
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

    public Card drawFirstCard() {
        if (cards.isEmpty()) {
            throw new RuntimeException("Le deck est vide !");
        } else {
            return cards.removeFirst();
        }
    }
}
