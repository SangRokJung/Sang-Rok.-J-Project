package hello0606;

/**
 * Exersice6_4
 */
public class Exersice6_4 {
    static double getDistance(int x, int y, int x1, int y1){
        double a = x - y;
        Math.sqrt(a);
        return a;
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));

    }
}