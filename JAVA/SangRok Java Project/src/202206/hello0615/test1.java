package hello0615;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);

        int a = 0; int b = 0; int c = 0;
        int expCount = 0;


    do{
        try{
            a = Scan.nextInt();
            b =  Scan.nextInt();
            c = a / b;
            break;
        }
        catch(java.util.InputMismatchException | ArithmeticException excp){
            expCount++;
            Scan.nextLine();  //Keyboard Scan buffer flush.
            System.out.println("Input ERROR. Re Enter.");
        }
    }
    while(expCount < 3);

    if(expCount == 3){
        System.out.println("Exit with 3 input errors.");
    }


        System.out.println("c = " + c);
    }
}
