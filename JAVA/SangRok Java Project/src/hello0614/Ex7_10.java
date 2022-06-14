package hello0614;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for(int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}