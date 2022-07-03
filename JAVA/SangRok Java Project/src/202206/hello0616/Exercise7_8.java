package hello0616;

public class Exercise7_8 {
    public static void main(String[] args) {
        Outer2 o =  new Outer2();
        Outer2.Inner in = o.new Inner();

        in.method1();
    }
}
