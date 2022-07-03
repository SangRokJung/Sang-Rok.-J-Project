package hello0629;

public class MathMethod {
    public static void main(String[] args) {
        // 주어진 값의 절댓값 반환
        int i       = Math.abs(-10);
        double d    = Math.abs(-10.0);
        // i = 10 
        // d = 10.0


        // 주어진 값을 올림하여 반환
        double d2 = Math.ceil(10.1);
        double d3 = Math.ceil(-10.1);
        double d4 = Math.ceil(10.000015);
        // d2 = 11
        // d3 = -10
        // d4 = 11.0


        // 주어진 두 값을 비교하여 작은 쪽을 반환
        double d5   = Math.max(9.5, 9.500001);
        int i2      = Math.max(0, -1);
        // d5 = 9.500001
        // i2 = 0


        // 주어진 값을 버림하여 반환
        double d6 = Math.floor(10.8);
        double d7 = Math.floor(-10.8);
        // d6 = 10.0
        // d7 = -11.0


        // 주어진 두 값을 비교하여 작은 쪽을 반환
        double d8 = Math.min(9.5, 9.50001);
        double d9 = Math.min(0, -1);
        // d8 = 9.5
        // d9 = -1


        // 0.0 ~ 1.0 범위의 임의의 double값을 반환한다
        double d10  = Math.random();
        int i3      = (int)(Math.random() * 10) + 1;
        // 0.0 < d10 < 1.0
        // 1 < i <11


        // 주어진 double값과 가장 가까운 정수값을 double형으로 반환하며 두 정수의 정 가운데 있는 값은 짝수를 반환
        double d11 = Math.rint(1.2);
        double d12 = Math.rint(2.6);
        double d13 = Math.rint(3.5);
        double d14 = Math.rint(4.5);
        // d11 = 1.0
        // d12 = 3.0
        // d13 = 4.0
        // d14 = 4.0


        long l      = Math.round(1.2);
        long l2     = Math.round(2.6);
        long l3     = Math.round(3.5);
        long l4     = Math.round(4.5);
        double d15  = 90.7552;
        double d16  = Math.round((d15 * 100) / 100.0);
        // l = 1
        // l2 = 3
        // l3 = 4
        // l4 = 5
        // d15 = 90.7552
        // d16 = 90.76
    }
}
