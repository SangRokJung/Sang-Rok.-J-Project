package hello0716;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

    public static void main(String[] args) {
        // Queue is Interface, function set.
        // Make LinkedList by queue
        // woudn't make arraylist 

        Queue<String> q = new LinkedList<String>();
        String temp;

        // offer와 add는 같다.
        q.offer("data1");
        q.offer("data2");
        q.offer("data3");


        // loaded first data
        temp = q.peek();
        System.out.println("q.peek() = " + q.peek());

        temp = q.peek();
        System.out.println("q.peek() = " + q.peek());

        temp = q.peek();
        System.out.println("q.peek() = " + q.peek());

        temp = q.poll();
        System.out.println("q.poll() = " + q.poll());

        temp = q.poll();
        System.out.println("q.poll() = " + q.poll());

        temp = q.poll();
        System.out.println("q.poll() = " + q.poll());

        temp = q.poll();
        System.out.println("q.poll() = " + q.poll());


        // Exceoption Code
        // Remove
        


    }

}
