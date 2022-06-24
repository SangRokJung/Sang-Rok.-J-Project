package hello0624;

public class apple implements Eatable {
    public String toString() {
        return "Hello apple";
    }

    @Override
    public String eat(){
        return "good";
    }
}
