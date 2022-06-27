package hello0627;

public class Dbox <L, R> {

    private L left;
    private R right;

    // Constructor
    public Dbox(){
        this.left = null;
        this.right = null;
    }
    public void setBox (L left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString () {
        return "Dbox [left=" + left + ", right=" + right + "]";
    }
}
