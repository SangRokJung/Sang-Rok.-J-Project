package hello0621;

public class rectangle implements Cloneable {

    private String name;
    private point upperLeft;
    private point lowerRight;
    

    public rectangle(){
        name = "no name";
        upperLeft = new point();
        lowerRight = new point();
    }


    public rectangle(int left, int top, int right, int bottom){
        name = "no name";
        upperLeft = new point(left, top);
        lowerRight = new point(right, bottom);
    }


    public void setPoint(int left, int top, int right, int bottom){
        upperLeft.Xpos = left;
        upperLeft.Ypos = top;

        lowerRight.Xpos = right;
        lowerRight.Ypos = bottom;
    }

    public int getSize(){
        int width;
        int height;
        int area;

        width = upperLeft.Xpos - lowerRight.Xpos;
        height = upperLeft.Ypos - lowerRight.Ypos;
        area = width * height;

        return area;
    }

    @Override
    public boolean equals(Object obj) {

        point ul = null;
        point lr = null;

        try{
            ul = ((rectangle)obj).upperLeft;
            lr = ((rectangle)obj).lowerRight;
        }
        catch(java.lang.ClassCastException e){
            return false;
        }


        if(true == upperLeft.equals(ul) && (true == lowerRight.equals(lr))){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "upperLeft(" + upperLeft.Xpos +", " + upperLeft.Ypos +"), lowerRight(" + lowerRight.Xpos +", " + lowerRight.Ypos +")";
    }


    //deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        rectangle result = null;

        result = (rectangle) super.clone();

        result.upperLeft =  (point) upperLeft.clone();
        result.lowerRight = (point) lowerRight.clone();

        return result;
    }
}
