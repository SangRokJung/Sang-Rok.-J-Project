package hello0614;

public class Marine extends Unit {
    
    void move(int x, int y){
        System.out.println("Marine [x= " + x + ",y=" + y + "]");
    }
    public void stimPack(){
        System.out.println("스팀팩 사용");
    }
}
