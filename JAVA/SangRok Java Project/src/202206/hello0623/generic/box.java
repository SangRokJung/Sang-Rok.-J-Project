package hello0623.generic;


public class box <T> {
    private T obj;

    public void set(T obj){
        this.obj = obj;
    }

    public T get(){
        return obj;
    }

    @Override
    public String toString(){
        return "box(" + obj + ")";
    }
    // T : Type Parameter, Template (타입 매개변수)
    // Apple : Type Argument (타입 인자)
}
