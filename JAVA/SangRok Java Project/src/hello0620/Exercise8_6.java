package hello0620;

public class Exercise8_6 {
    static void method(boolean b){
        try{
            System.out.println(1);
            if (b)
                System.exit(0);
            System.out.println(2);
        }
        catch(RuntimeException r){
            System.out.println(3);
            return;
        }
        catch(Exception e){
            System.out.println(4);
            return;
        }
        finally{
            System.out.println(5);
            //예외 안되면 finally 거치고 나간다.
            //예외 걸리면 finally 거치고 끝.
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        // method(true);
        method(false);
    }
}
