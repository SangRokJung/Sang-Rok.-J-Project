package hello0610;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        
        fe.water();
        car = fe;
        // car.water();
        // 컴파일 에러: car타입의 참조변수로는 water()를 호출 할 수 없다.
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
