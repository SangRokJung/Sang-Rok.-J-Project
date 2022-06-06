package hello0606;

public class Ex6_14 {
    static{
        // class Initialization Block
        System.out.println("static {}");

        // instance Initialization block
        System.out.println("{}");
    }

    public Ex6_14(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14();");
        Ex6_14 bt = new Ex6_14();

        System.out.println("ex6_14 bt2 = new Ex6_14();");
        Ex6_14 bt2 = new Ex6_14();

        System.out.println(bt2);
        System.out.println(bt);
    }
}
