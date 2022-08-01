package hello0701;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSmple {
    public static void main(String[] args) {
        // tree set
        TreeSet<Integer> tree = new TreeSet<>();

        // input the data
        tree.add(1);
        tree.add(2);
        tree.add(7);
        tree.add(3);
        tree.add(9);

        // size 출력
        System.out.println("count = " + tree.size());

        // print of for 
        for(Integer i : tree){
            System.out.println(i);
        }


        System.out.println("--------------------------------------------------------");


        // print of iterator
        Iterator<Integer> iter = tree.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
   


}
