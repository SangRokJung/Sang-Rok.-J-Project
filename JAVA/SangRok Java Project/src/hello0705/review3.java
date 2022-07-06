package hello0705;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class review3 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        String temp;

        q.offer("data1");
        q.offer("data2");
        q.offer("data3");

        temp = q.peek()
        System.out.println( + temp);

    }
    
}
