package hello0606;

public class marine {
    int x= 0;
    int y = 0;
    int hp = 0;
    int weapon = 0;
    int armor = 0;

    public void weaponUp(){
        weapon ++;
    }

    public void armorUp(){
        armor ++;
    }

    public void move (int x, int y){
        this.x = x;
        this.y = y;
    }
}
