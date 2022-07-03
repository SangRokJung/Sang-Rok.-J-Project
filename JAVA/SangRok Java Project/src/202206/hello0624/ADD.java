package hello0624;

public class ADD <T extends Number> {
    // Generic을 이요하여 두 수를 더하는 add라는 함수를 만드려고한다.
    // Number의 파생 class만 가능하도록 구현하시오.

    private T obj;


    //constructor
    public ADD(){
    }
    public ADD(T obj){
        this.obj = obj;
    }



    public void adding(){
        System.out.println(obj.add());
    }
}
