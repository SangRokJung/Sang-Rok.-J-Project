package hello0615;

public class Ex7_12 {
    class InstancInner{
        int iv  = 100;
        // static int cv = 100;
        final static int CONST = 100;
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }

    public void myMethod(){
        class LocalInner{
            int iv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstancInner.CONST);
        System.out.println(StaticInner.cv);
    }

    //내부 클래스 중에서 staticclass만 static 맴버를 가질 수 있다.
    //드문 경우지만 내부 클래스에 static 변수를 선언해야 한다면 static class로 선언해야한다.
}
