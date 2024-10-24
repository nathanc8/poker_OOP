import java.util.ArrayList;

public class Player {
    private String name;
    private int id; //je ne suis pas sûr de l'utilité de cette propriété
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        Dealer.getPlayers().add(this); //permet d'injecter dynamiquement le joueur au sein de notre ArrayList de joueurs au sein de la classe Dealer
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
