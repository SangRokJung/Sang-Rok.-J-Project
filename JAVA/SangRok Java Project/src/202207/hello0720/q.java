package hello0720;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q {
    public static void main(String[] args) {
        Queue q = new LinkedList(); //Q인터페이스의 구현
        Stack st = new Stack();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("=Stack=");
        while(!st.isEmpty()){
            System.out.println(st.pop()); // Stack에서 요소 하나를 꺼내
        }

        System.out.println("=Queue");
        while(!q.isEmpty()){
            System.out.println(q.poll()); // Queue에서 요소 하나를 꺼내
        }
    }
}
