package hello0614;

public class Tank extends Unit {
    void move(int x, int y){
        System.out.println("Tank[x= " + x + ",y=" + y + "]");
    }
    void changeMode(){
        System.out.println("change Mode");
    }
}
