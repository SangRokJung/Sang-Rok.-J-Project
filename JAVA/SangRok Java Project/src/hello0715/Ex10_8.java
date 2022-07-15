package hello0715;

import java.util.*;
import java.text.*;

public class Ex10_8 {
    public static void main(String[] args) {
        Date today = new Date(); // 현재의 시간과 날짜를 저장한다.

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        
        sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날 입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날 입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
        sdf8 = new SimpleDateFormat("오늘은 올 해의 W번째 주입니다.");
        sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일 입니다.");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));

        // 2022-07-15
        // '22년 7월 15일 금요일
        // 2022-07-15 17:33:475
        // 2022-07-15 17:33:35 오후
        // 오늘은 올 해의 196번째 날 입니다.
        // 오늘은 이 달의 15번째 날 입니다.
        // 오늘은 올 해의 29번째 주입니다.
        // 오늘은 올 해의 3번째 주입니다.
        // 오늘은 이 달의 3번째 금요일 입니다.
    }
}
