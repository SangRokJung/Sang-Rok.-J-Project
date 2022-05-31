package hello0531;

public class calc {
    public static void main(String[] args) {
        quadraticEquation qe = new quadraticEquation(1, -1, -2);

        System.out.println(qe.getSolution(true));
        System.out.println(qe.getSolution(false));
    }
}
