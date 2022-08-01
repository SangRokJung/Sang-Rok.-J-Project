package hello0710;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        String temp;

        q.offer("data1");
        q.offer("data2");
        q.offer("data3");

        temp = q.peek();
        System.out.println("peek()" + temp);

        temp = q.poll();
        System.out.println("poll()" + temp);

        try{
            temp = q.remove();
        }
        catch(Exception e){
            System.out.println("q.remove()" +  q.remove());
        }

        try{
            temp = q.element();
        }
        catch(Exception e){
            System.out.println("element()" + q.element());
        }

    }
}
