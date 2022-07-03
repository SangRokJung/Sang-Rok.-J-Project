package hello0616;

public class excep1 {
    static int a = 0;

    public static int func1(){
        return a;

    }

    public static void main(String[] args) {
        try{
            func1();
        }
        catch(Throwable excp){
            System.out.println("잘못된연산");
            return;
        }
    }
}
