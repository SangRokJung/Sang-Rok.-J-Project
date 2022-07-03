package hello0623;

public class Node {
    private Object data;
    private Node next;
    private Node prev;

    public Node(Object input){
        this.data = input;
        this.next = null;
        this.prev = null;
    }

    public String toString(){
        return String.valueOf(this.data);
    }
}
