import java.util.ArrayList;

//classe qui va gérer le jeu en intégralité & qui va avoir en tête les informations du jeu
public class Dealer {

    private static ArrayList<Player> players = new ArrayList<>();
    private static int nbPLayers;


    private static ArrayList<Card> board = new ArrayList<>();

    public static ArrayList<Player> getPlayers() {
        return players;
    }
    
    public static ArrayList<Card> getBoard() {
        return board;
    }

    public static int getNbPLayers() {
        return nbPLayers;
    }

    public static void setNbPLayers(ArrayList<Player> players) {
        Dealer.nbPLayers = players.size();
    }

    public static void dealCards(int nbCardsDealed, Deck deck) {
        int nbPlayers = getNbPLayers();
        if (nbCardsDealed <= 0 || nbPlayers <= 0) {
            throw new RuntimeException("Le nombre de cartes distribuées et de joueurs doit être supérieur à zéro.");
        } else {
            for (int i = 0; i < nbCardsDealed; i++) {
                for (int j = 0; j < nbPlayers; j++) {
                    players.get(j).getHand().add(deck.drawFirstCard());
                }
            }
        }
    }

    public static ArrayList<Card> flop(Deck deck) {
        deck.getCards().removeFirst();
        board.add(deck.drawFirstCard());
        board.add(deck.drawFirstCard());
        board.add(deck.drawFirstCard());
        return board;
    }

    public static ArrayList<Card> turn(Deck deck) {
        deck.getCards().removeFirst();
        board.add(deck.drawFirstCard());
        return board;
    }

    public static ArrayList<Card> river(Deck deck) {
        deck.getCards().removeFirst();
        board.add(deck.drawFirstCard());
        return board;
    }
}
