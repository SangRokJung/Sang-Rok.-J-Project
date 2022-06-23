package hello0623.generic;

public class dBox <L, R> {
    private L left;
    private R right;

    public void setBox(L left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "dBox [left = " + left + ", right = " + right + "]";
    }

    public R getRight(){
        return right;
    }
    public L getLeft(){
        return left;
    }
}
