package hello0701;

import java.util.Objects;

public class IntValue {
    private int value;



    IntValue(){
        this.value = 0;
    }
    IntValue(int value) {
        this.value = value;
    }


    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "IntValue [vlaue = " + value + "]";
    }

    @Override
    public boolean equals(Object obj){
        // try를 사용하면 처리 속도의 저하가 발생합니다.
        // try{
        //     if(this.value == ((IntValue)obj).value){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // catch(Exception e){
        //     return false;
        // }
        
        if(this == obj)
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass())
            return false;
        return (this.value == ((IntValue)obj).value);
    }


    @Override
    public int hashCode() {
        // return this.value % 3;
        return Objects.hash(value);
    }

}
