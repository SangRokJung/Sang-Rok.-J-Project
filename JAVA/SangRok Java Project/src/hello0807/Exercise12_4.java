package hello0807;

import java.util.*;

public class Exercise12_4 {
    public static ArrayList<? extends Product> merger(ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
            ArrayList<? extends Product> newList = new ArrayList<>(list);

            newList.addAll(list2);

            return newList;
        }
}

// public class answer {
//     public static <T extends Product> ArrayList<T> merge (ArrayList<T> list1, ArrayList<T> list2) {
//         ArrayList<T> newList = new ArrayList<>(list1);

//         newList.addAll(list2);

//         return newList;
//     }
}