import java.util.ArrayList;

public class Player {
    private String name;
    private int id;
    private ArrayList<Card> hand;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
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
