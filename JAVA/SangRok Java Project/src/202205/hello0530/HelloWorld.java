package hello0530;

public class HelloWorld {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        boolean result = false;

        // result = ((num1 += 10) < 0 && (num2 += 10) > 0);
        // System.out.println(result);
        
        int a = num1 + 10;
        int b = num2 + 10;
        result = (a < 0 || b > 0);
        System.out.println(result);
    }
}