import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(new ArrayList<Card>());
        Deck.displayDeck(deck.getCards());

        Player nathan = new Player("Nathan", 1);
        Player anne = new Player("Anne", 2);
        Player camille = new Player("Camille", 3);
    }
}