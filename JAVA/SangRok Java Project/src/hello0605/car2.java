package hello0605;

public class car2 {
    String color;
    String gearType;
    int door;

    car2(){
        this("white", "auto", 4);
    }

    car2(String color){
        this(color, "auto", 4);
    }

    car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
