package hello0715;

import java.text.*;
import java.util.Date;

public class Ex10_9 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try{
            Date d = df.parse("2019년 11월 23일");
                // 문자열에서 날짜
            System.out.println(df2.format(d));
                // 날짜에서 문자열
        }
        catch (Exception e){
        }
    }
}
