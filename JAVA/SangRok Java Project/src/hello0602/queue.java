package hello0602;

import java.util.Arrays;

public class queue {
// Basic Array is int [10].
// FIFO Structure.

    //data entry location
    //euQueue Pointer
    int rearPointer = -1;
    
    //data subtract location
    //deQueue Pointer
    int frontPointer = 0;

    //Queue
    final Object[] queue;




    //constructor
    public queue(){
        this.queue = new Object[10];
    }
    public queue(int queueSize){
        this.queue = new Object[queueSize];
    }




    // Verify the Queue is full.
    public boolean isFull(){
        if(rearPointer == -1){
            return false;
        }
        else if((rearPointer == this.queue.length -1  && frontPointer == 0) ||
                (frontPointer - rearPointer == 1)){
            return true;
        }
        return false;
    }

    // Verify the Queue is empty.
    public boolean isEmpty(){
        if(rearPointer <= 0 && frontPointer == 0){
            return true;
        }
        return false;
    }

    // enQueue Function
    // Entry the data in to the Queue
    public void enQueue(Object data){

        if(isFull()){
            throw new RuntimeException("Queue is Full");
        }
        else{
            if((rearPointer + 1) % (this.queue.length) == 0){
                rearPointer = 0;
                queue[rearPointer] = data;
            }
            else{
                rearPointer++;
                queue[rearPointer] = data;
            }
        }
    }

    // deQueue Function
    // subtract the data in to the Queue
    public Object deQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        Object tempData = queue[frontPointer];
        queue[frontPointer] = null;
        frontPointer++;
        return tempData;

    }

    // Check the Queue Function
    public String check(){
        return Arrays.toString(queue);
    }









    public static void main(String[] args) {
        queue qu = new queue(10);

        qu.enQueue(10);
        qu.enQueue(20);
        qu.enQueue(30);
        qu.enQueue(40);
        qu.enQueue(50);
        qu.enQueue(60);
        qu.enQueue(70);
        qu.enQueue(80);
        qu.enQueue(90);
        qu.enQueue(100);

        qu.deQueue();
        // qu.deQueue();
        // qu.deQueue();
        // qu.deQueue();
        // qu.deQueue();
        // qu.deQueue();
        // qu.deQueue();

        qu.enQueue(110);
        // qu.enQueue(120);
        // qu.enQueue(130);
        // qu.enQueue(140);
        // qu.enQueue(150);
        // qu.enQueue(160);
        // qu.enQueue(170);

        System.out.println(qu.check());
        System.out.println(qu.queue.length);
        System.out.println("RearPointer = " + qu.rearPointer);
        System.out.println("FrontPointer = " + qu.frontPointer);
    }
}
