package hello0716;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(new String("abc"));
        list.add(new String("dev"));
        list.add(new String("abc"));
        list.add(new String("asd"));

        HashSet<String> tempSet = new HashSet<String>();

        List<String> list2 = new ArrayList<String>(tempSet);

        for(String s : list2){
            System.out.println(s);
        }

    }
}
