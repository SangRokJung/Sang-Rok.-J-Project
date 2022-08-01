package hello0720;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_4 {
    public static void main(String[] args) {
        //자신이 태어난 날터 현재까지 몇일이 지났는지 계산하여 출력하시오.

        // 태어난날, 현재 Calender 생성
        Calendar date1 = Calendar.getInstance(); 
        Calendar date2 = Calendar.getInstance();

        // 태어난날, 현재 Calender 시간 설정 
        date1.set(2000, 0, 1); // 2000년 1월 1일로 날짜를 설정한다. 
        date2.set(2016, 0, 29); // 2016년 1월 29일로 날짜를 설정한다.

        // SDF의 pattern 설정
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        // 태어난날, 현재 시간 출력
        System.out.println("birth day=" + df.format(new Date(date1.getTimeInMillis())));
        System.out.println("today =" + df.format(new Date(date2.getTimeInMillis())));

        // 몇일이 지났는지 계산
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println("difference = " + difference);

        System.out.println(difference/(24*60*60) +"days"); //1일 = 24*60*60
    }
}
