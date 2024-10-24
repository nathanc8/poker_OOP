import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(new ArrayList<Card>());
        deck.createDeck();
        deck.shuffleDeck();
        System.out.println("Contenu du Deck :");
        Deck.displayDeck(deck.getCards());

        Player nathan = new Player("Nathan", 1);
        Dealer.getPlayers().add(nathan); //permet d'injecter dynamiquement le joueur au sein de notre ArrayList de joueurs au sein de la classe Dealer
        Player anne = new Player("Anne", 2);
        Dealer.getPlayers().add(anne);
        Player camille = new Player("Camille", 3);
        Dealer.getPlayers().add(camille);


        Dealer.setNbPLayers(Dealer.getPlayers());

        Dealer.dealCards(2, deck);

        System.out.println("Contenu de la main de Nathan :");
        System.out.println(nathan.getHand());

        System.out.println("Taille du deck après distribution : doit retourner 46");
        System.out.println(deck.getDeckSize());

        Dealer.flop(deck);
        System.out.println("Taille du deck après le flop : doit retourner 42");
        System.out.println(deck.getDeckSize());

        Dealer.turn(deck);
        System.out.println("Taille du deck après le turn : doit retourner 40");
        System.out.println(deck.getDeckSize());

        Dealer.river(deck);
        System.out.println("Taille du deck après la river : doit retourner 38");
        System.out.println(deck.getDeckSize());

        System.out.println("Contenu du board :");
        System.out.println(Dealer.getBoard());


    }
}