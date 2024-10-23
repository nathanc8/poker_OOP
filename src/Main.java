import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(new ArrayList<Card>());

        Deck.displayDeck(deck.getCards());
    }
}