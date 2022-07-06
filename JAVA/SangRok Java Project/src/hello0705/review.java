package hello0705;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class review {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(new String("abc"));
        list.add(new String("bcv"));
        list.add(new String("sfe"));
        list.add(new String("add"));

        HashSet<String> tempSet = new HashSet<String>(list);

        List<String> list2 = new ArrayList<String>(tempSet);

        for(String s : list2){
            System.out.println(s);
        }
    }
}
