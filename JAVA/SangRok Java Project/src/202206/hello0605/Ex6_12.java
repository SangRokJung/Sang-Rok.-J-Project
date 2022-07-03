package hello0605;

public class Ex6_12 {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        car c2 = new car("white", "auot", 4);

        System.out.println(c1.color + c1.gearType + c1.door);

        System.out.println(c2.color + c2.gearType + c2.door);

    }
}
