package hello0729;

public class ex3 {
    public static void main(String[] args) {
        // class Tv extends Product {}
        // class Audio extends Product {}

        // ArrayList<Tv> list = new ArrayList<Tv>();       // 일치
        // ArrayList<Product> list = new ArrayList<Tv>();  // Error

        // List <Tv> list = new ArrayList<Tv>();   // 일치. ArrayList가 list를 구현
        // List <Tv> list = new LinkedList<Tv>();  // 일치. LinkedList가 list를 구현
        
        // ArrayList<Product> list = new ArrayList<Product>();
        // list.add(new Product());
        // list.add(new Tv());         // OK. Product 자손
        // list.add(new Audio());      // OK. Product 자손
    }
}
