package hello0624;

// number와 number를 상속받은 클래스만 받아주고 싶다.
public class NumBox <T extends Number> {
    private T obj;

    public NumBox(T obj) {
        this.obj = obj;
    }

    public int getIntNumber(){
        return obj.intValue();
    }
}
