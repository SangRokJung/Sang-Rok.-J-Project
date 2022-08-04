package hello0803;

enum Direction2{
    EAST(10, ">"), SOUTH(20, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }
    public String getSymbol() {
        return symbol;
    }

    public static Direction2 of(int dir){
        if (dir < 1 || dir > 4){
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }
}

public class Ex12_6 {
    
}
