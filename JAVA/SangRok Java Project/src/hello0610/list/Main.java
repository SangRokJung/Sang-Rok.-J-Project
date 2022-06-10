package hello0610.list;

public class Main {
    
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();


        numbers.addFirst(30);
        numbers.addFirst(20);
        numbers.addFirst(10);

        numbers.addLast(40);
        numbers.addLast(50);
        numbers.addLast(60);

        numbers.add(1, 15);

        numbers.removeFirst();
    
        System.out.println(numbers.toString());
    }
}
