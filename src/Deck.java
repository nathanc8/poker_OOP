import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    //setter du deck : à l'instanciation de celui-ci, il sera créé & mélangé.
    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        createDeck();
        shuffleDeck();
    }

    //permet de visualiser le deck, et se sert notamment de la méthode toString() Override au sein de la classe Card
    public static void displayDeck(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    //permet de faire un test "manuel" sur le nombre de cartes restantes au sein du deck après la distribution
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

    //méthode qui sera appelée au sein de la classe Dealer pour la distribution
    public Card drawFirstCard() {
        if (cards.isEmpty()) {
            throw new RuntimeException("Le deck est vide !");
        } else {
            return cards.removeFirst();
        }
    }
}
