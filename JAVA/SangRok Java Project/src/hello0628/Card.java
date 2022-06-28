package hello0628;

public class Card {
    String kind;
    int number;

    public Card() {
        this("Spade", 1);
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}
