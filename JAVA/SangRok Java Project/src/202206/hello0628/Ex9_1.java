package hello0628;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)){
            System.out.println("같다.");
        }
        else{
            System.out.println("다르다.");
        }
    }
}
