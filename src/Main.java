import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(new ArrayList<Card>());
        Deck.displayDeck(deck.getCards());

        Player nathan = new Player("Nathan", 1);
        Player anne = new Player("Anne", 2);
        Player camille = new Player("Camille", 3);

        Dealer.setNbPLayers(Dealer.getPlayers());

        Dealer.dealCards(2, deck);

        System.out.println(nathan.getHand());

        System.out.println(deck.getDeckSize());

        Dealer.flop(deck);
        Dealer.turn(deck);
        Dealer.river(deck);

        System.out.println(Dealer.getBoard());


    }
}