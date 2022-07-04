package hello0703;

import java.util.HashSet;
import java.util.Iterator;

public class mHashset {
    public static void main(String[] args) {
        HashSet<Moniter> hset = new HashSet<>();

        hset.add(new Moniter("Apple", "black"));
        hset.add(new Moniter("Samsung", "black"));
        hset.add(new Moniter("LG", "black"));
        hset.add(new Moniter("Apple", "black"));
        hset.add(new Moniter("DELL", "black"));
        hset.add(new Moniter("VenQ", "black"));
        hset.add(new Moniter("HP", "black"));

        Iterator<Moniter> iter = hset.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
