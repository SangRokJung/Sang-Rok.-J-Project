package hello0531;

import java.util.Arrays;

public class stack {
    // int[10]
    // 선입 후출 구조
    // Stack Pointer로 제어
    // 스택에 데이터 넣는 기능(push), 빼는 기능(pop) 필요

    int top = -1;
    final Object[] stack;
    
    // 생성자
    // Set the Size of the Stack
    public stack(int stackSize){
        this.stack = new Object[stackSize];
    }

    // checking the empty of the data
    public boolean isEmpty(){
        return -1 == top;
    }

    // Checking the full of the data
    public boolean isFull(){
        return stack.length - 1 == top;
    }

    // Stack push Function
    public void push(Object data){
        if(isFull()){
            throw new RuntimeException("stack is full");
        }
        else{
            stack[++top] = data;
        }
    }

    // Stack Pop Function
    public Object pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        else{
            Object tempData = stack[top];
            stack[top--] = null;
            return tempData;
        }
    }

    // Stack Cehck Function
    public String check(){
        return Arrays.toString(stack);
    }

    public static void main(String[] args) {
        stack cs = new stack(10);

        cs.push(10);
        cs.push(20);
        cs.push(30);
        System.out.println(cs.stack[0]);
        System.out.println(cs.top);
        System.out.println(cs.check());
    } 
}
