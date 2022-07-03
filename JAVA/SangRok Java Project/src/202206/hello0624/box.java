package hello0624;

// 가져온 클래스가 Eatable로 부터 상속을 받아야 가능하다.
// public class box <T extends Eatable> 
public class box <T> {
    private T obj;

    //constructor
    public box(){
    }
    public box(T obj){
        this.obj = obj;
    }



    //set, get
    public void set(T obj){
        this.obj = obj;
    }
    public T get(){
        return obj;
    }



    // public void eating(){
    //     //클래스의 eat()을 호출!
    //     System.out.println(obj.eat());
    // }



    @Override
    public String toString(){
        return "box(" + obj + ")";
    }

}
