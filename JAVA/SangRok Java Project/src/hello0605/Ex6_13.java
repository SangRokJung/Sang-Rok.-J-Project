package hello0605;

public class Ex6_13 {
    public static void main(String[] args) {
        car2 c1 = new car2();
        car2 c2 = new car2("blue");
        
        System.out.println(c1.color + c1.gearType + c1.door);
        System.out.println(c2.color + c2.gearType + c2.door);
        
    }
}
