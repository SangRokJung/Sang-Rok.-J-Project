package hello0616;

import javax.sql.rowset.spi.SyncResolver;

public class Exercise7_7 {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        System.out.println(in.iv);
    }
}
