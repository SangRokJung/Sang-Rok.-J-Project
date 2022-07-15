package hello0715;

import java.text.*;

public class Ex10_7x {
    public static void main(String[] args) {
        DecimalFormatSample df = new DecimalFormatSample("#,###.##");
        DecimalFormatSample df2 = new DecimalFormatSample("#.###E0");

        try{
            Number num = df.parse("1,234,567.89");
            System.out.println("1,234, 567.89" + " 숫자열 ->");

            double d = num.doubleValue();
            System.out.println(d + "  문자열 -> ");

            System.out.println(df2.format(num));
        }
        catch(Exception e){}
    }
}
