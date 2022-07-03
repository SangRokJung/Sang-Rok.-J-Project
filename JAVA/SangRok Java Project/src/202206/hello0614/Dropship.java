package hello0614;

public class Dropship extends Unit {
    void move(int x, int y){
        System.out.println("Dropship[x= " + x + ",y=" + y + "]");
    }
    void load(){
        System.out.println("탑승");
    }
    void unload(){
        System.out.println("내림");
    };
}
