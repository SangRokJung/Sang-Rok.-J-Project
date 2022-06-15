package hello0615;

import java.util.*;

public class Excep {
    public static void main(String[] args) {
        Scanner kbScan = new Scanner(System.in);

        //try-catch문 :예외 처리.
        
        int a = 0;
        int b = 0;

        try{
            a = kbScan.nextInt();
            b = kbScan.nextInt();
        }
        catch(java.util.InputMismatchException excp){
            System.out.println("잘못 입력 하셨습니다. 다시 입력하세요.");

            excp.getMessage();

            kbScan.close();
            return;
        }
        

        kbScan.close();

        System.out.println(a / b);
    }
}
