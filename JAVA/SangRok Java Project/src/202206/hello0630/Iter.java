package hello0630;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Iter {
    public static void main(String[] args) {
        // make LinkedList
        List<String> list = new ArrayList<String>();

        String temp = null;

        // input the data to list
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");


        // Get Iterator
        Iterator<String> it = list.iterator();


        // printing data from Iterator
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------------------------------------------------------");

        // again print data from Itertor
        it = list.iterator();
        System.out.println("* aging data from Iterator");
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("-------------------------------------------------------------------");


        // print from enhanced-for syntax
        it = list.iterator();
        System.out.println("* print from enhanced-for syntax");
        for (String s : list){
            System.out.println(s);
        }


        System.out.println("-------------------------------------------------------------------");


        // print from for syntax
        it = list.iterator();
        System.out.println("* print from for syntax");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 의외로 많이 사용하는 문장
        for(it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }


        System.out.println("-------------------------------------------------------------------");


        // delete the data
        it = list.iterator();
        while(it.hasNext()) {
            //save in temp
            temp = it.next();
        }

    }

}
