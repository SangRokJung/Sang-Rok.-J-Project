package hello0630;

public class Value {
    private int value;


    public Value(){
        this.value = 0;
    }
    public Value(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString(){
        return "Value(" + value + ")";
    }

}
