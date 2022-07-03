package hello0614;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();

        fe.water();
        car = fe;
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
