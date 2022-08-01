package hello0703;

import java.util.Objects;

public class Moniter {
    String model;
    String color;

    Moniter(){
        this("none", "black");
    }
    Moniter(String model, String color) {
        this.model = model;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Moniter{" + model + ", " + color + "}";
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        return ((this.model == ((Moniter)obj).model) && 
                (this.color == ((Moniter)obj).color));
    }


    @Override
    public int hashCode() {
        //값이 너무 크기 때문에 작게 해준다.
        int hashColor = color.hashCode();
        int hashModel = model.hashCode();
        return (int)((hashModel + hashColor) / 10000);
    }
}
