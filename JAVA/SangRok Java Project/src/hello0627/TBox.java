package hello0627;

public class TBox <T1, T2> {

    private T1 left;
    private T2 right;

    
    // Constructor
    public TBox(){
        this.left = null;
        this.right = null;
    }
    public void setBox (T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString () {
        return "Dbox [left=" + left + ", right=" + right + "]";
    }
}
