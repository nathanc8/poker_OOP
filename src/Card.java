public class Card {
    private Color color;
    private Number number;

    public Card(Color color, Number number) {
        this.color = color;
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }
}
