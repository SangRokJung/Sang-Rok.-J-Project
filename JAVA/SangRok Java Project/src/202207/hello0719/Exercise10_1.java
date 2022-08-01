package hello0719;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {

        Calendar time = Calendar.getInstance();
        time.set(2020, 0, 01);

        for(int i = 0; i < 12; i++) {
            // 1일의 요일을 구한다.
            // EX) 7 = 토요일, 1 = 일요일
            int weekDay = time.get(Calendar.DAY_OF_WEEK);
            
            // 둘째주 일요을 찾는다.
            if(weekDay == 1){
                time.set(Calendar.DAY_OF_MONTH, 8);
            }
            else{
                time.set(Calendar.DAY_OF_MONTH, 16 - weekDay);
            }

            // Data로 형식을 바꿔준다.
            Date date = time.getTime();


            // 출력
            System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번째 E요일 입니다.").format(date));

            // 월을 더해주고, 일을 1일로 초기화 한다.
            time.add(Calendar.MONTH, 1);
            time.set(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
