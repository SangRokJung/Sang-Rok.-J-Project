package hello0704;

import java.util.LinkedList;
import java.util.Queue;

public class sample {
    public static void main(String[] args) {
        // queue는 interface, 기능 집합이다.
        // queue를 가지고 linkedList를 구현하겠다.
        // queue를 가지고 ArrayList는 구현 되지 않는다.
        Queue<String> q = new LinkedList<String>();
        String temp;

        // offer와 add는 같다.
        q.offer("data1");
        q.offer("data2");
        q.offer("data3");

        temp = q.peek();
        System.out.println("peek() : " + temp);

        temp = q.poll();
        System.out.println("poll() : " + temp);

        temp = q.poll();
        System.out.println("poll() : " + temp);

        temp = q.poll();
        System.out.println("poll() : " + temp);

        temp = q.poll();
        System.out.println("poll() : " + temp); //null


        // Exception Code
        // remove
        try{
            temp = q.remove();
        }
        catch (Exception e){
             System.out.println("remove() : " + temp);
        }
        // element
        try{
            temp = q.element();
        }
        catch (Exception e){
            System.out.println("element() : " + temp);
        }
    }
}
