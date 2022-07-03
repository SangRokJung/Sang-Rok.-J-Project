package hello0628;

public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(80118111L);
        Person p2 = new Person(80118111L);

        if(p1.equals(p2)){
            System.out.println("같다.");
        }
        else{
            System.out.println("다르다");
        }
    }
}
