public enum Color {
    Hearts(1),
    Spades(2),
    Diamonds(3),
    Clubs(4);

    private final int suitValue;

    Color(int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }
}
