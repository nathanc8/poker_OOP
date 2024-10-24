import java.util.ArrayList;

//classe qui va gérer le jeu en intégralité & qui va avoir en tête les informations du jeu
public class Dealer {

    //mon ide m'indique que board & players pourraient être final, mais je ne comprends pas pourquoi, du fait que j'ajoute des cartes en son sein.
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

    //Setter de nbPLayers à partir de la taille du tableau dans lequel sont stockés dynamiquement les joueurs à leur instanciation
    public static void setNbPLayers(ArrayList<Player> players) {
        Dealer.nbPLayers = players.size();
    }

    public static Deck dealCards(int nbCardsDealed, Deck deck) {
        int nbPlayers = getNbPLayers();
        if (nbCardsDealed <= 0 || nbPlayers <= 0) {
            throw new RuntimeException("Le nombre de cartes distribuées et de joueurs doit être supérieur à zéro.");
        } else {
            for (int i = 0; i < nbCardsDealed; i++) {
                for (int j = 0; j < nbPlayers; j++) {
                    //On ajoute la carte du haut du paquet à l'élément à l'indice j au sein du tableau players (qui stocke les joueurs à leur création)
                    players.get(j).getHand().add(deck.drawFirstCard());
                }
            }
        }
        return deck;
    }

    //Je trouve cette fonction pas très propre, mais je ne sais pas s'il y a la possibilité de faire réellement mieux.
    //Peut être une refacto de la ligne board.add(deck.drawFirstCard()) ?
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
