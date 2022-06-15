package hello0615;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0; i < deck.card.length; i++){
            System.out.println(deck.card[i] + ",");
        }
    }
}
