package hello0616;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        deck.shuffle();

        for(int i = 0; i < deck.card.length; i++){
            System.out.print(deck.card[i] + ",");
        }

        System.out.println("");

        System.out.println(deck.pick(4));
        System.out.println(deck.pick());
    }
}
