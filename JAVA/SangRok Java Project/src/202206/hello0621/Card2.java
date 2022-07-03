package hello0621;

public class Card2 {
    String kind;
    int number;

    public Card2(){
        this("SPADE", 1);
    }

    public Card2(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        return "kind : " + kind + ", number : " + number;
    }
    
}
