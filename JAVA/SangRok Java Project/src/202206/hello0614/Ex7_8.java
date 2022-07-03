package hello0614;

public class Ex7_8 {
    public static void main(String[] args) {
        buyer b = new buyer();

        // Tv1 t = new Tv1();
        // b.buy(t);

        b.buy(new Tv1());
        b.buy(new Computer1());
        b.buy(new iPhone12Pro());

        System.out.println("현재 남은 돈은 " + b.money + "입니다.");
        System.out.println("현재 보너스 점수는" + b.bonusPoint + "입니다.");
    }
}
