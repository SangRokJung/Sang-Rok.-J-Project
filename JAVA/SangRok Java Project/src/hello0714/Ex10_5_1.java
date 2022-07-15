package hello0714;

import java.util.*;

public class Ex10_5_1 {
    // Calendar를 date로 변환
    Calendar cal1 = Calendar.getInstance();
    ...
    Date d1 = new Date(cal1.getTimeInMillis()); //Date(long date)


    // Date를 Calendar로 변환
    Date d2 = new Date();
    Calendar cal2 = Calendar.getInstance();
    ...
    cal2.setTime(d2);

}
