package hello0621;

public class point implements Cloneable {
    public int Xpos, Ypos;

    public point() {
        this.Xpos = 1;
        this.Ypos = 1;
    }

    public point(int Xpos, int Ypos) {
        this.Xpos = Xpos;
        this.Ypos = Ypos;
    }


    @Override
    public String toString() {
        return "point(" + Xpos + ", " + Ypos +")";
    }

    @Override
    public boolean equals(Object o) {
        try {
            if ((this.Xpos == ((point)o).Xpos) && 
                (this.Ypos == ((point)o).Ypos))
                return true;
            else   
                return false;
        } 
        catch (java.lang.ClassCastException e) {
            return false;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
