package hello0719;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        Calendar time1 = Calendar.getInstance();
        time1.set(Calendar.YEAR, 2020);
        time1.set(Calendar.MONTH, 0);
        time1.set(Calendar.DAY_OF_MONTH, 12);

        SimpleDateFormat sdf1;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd은 W번째 E요일 입니다.");

        Date date1 = time1.getTime();

        // System.out.println(sdf1.format(date1));

        // ----------------------------------------------------------------

        Calendar time2 = Calendar.getInstance();
        time2.set(2020, 0, 01);

        for(int i = 0; i < 12; i++) {
            // 1일의 요일을 구한다.
            // EX) 7 = 토요일, 1 = 일요일
            int weekDay = time2.get(Calendar.DAY_OF_WEEK);
            
            
            // 둘째주 일요을 찾는다.
            if(weekDay == 1){
                time2.set(Calendar.DAY_OF_MONTH, 8);
            }
            else{
                time2.set(Calendar.DAY_OF_MONTH, 16 - weekDay);
            }


            // Data로 형식을 바꿔준다.
            Date date2 = time2.getTime();


            // 출력
            System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번째 E요일 입니다.").format(date2));

            // 월을 더해주고, 일을 1일로 초기화 한다.
            time2.add(Calendar.MONTH, 1);
            time2.set(Calendar.DAY_OF_MONTH, 1);
        }


        // Calendar time2 = Calendar.getInstance();
        // Calendar time3 = Calendar.getInstance();
        // Calendar time4 = Calendar.getInstance();
        // Calendar time5 = Calendar.getInstance();
        // Calendar time6 = Calendar.getInstance();
        // Calendar time7 = Calendar.getInstance();
        // Calendar time8 = Calendar.getInstance();
        // Calendar time9 = Calendar.getInstance();
        // Calendar time10 = Calendar.getInstance();
        // Calendar time11 = Calendar.getInstance();
        // Calendar time12 = Calendar.getInstance();

        
        
    }
}
