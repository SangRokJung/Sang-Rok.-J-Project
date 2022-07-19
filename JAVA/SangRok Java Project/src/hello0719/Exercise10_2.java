package hello0719;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {
    public static void main(String[] args) {
        String pattern1 = "yyyy-MM-dd";
        String pattern2 = "입력하신 날짜는 E요일 입니다.";

        DateFormat sdf  = new SimpleDateFormat(pattern1);
        DateFormat sdf2 = new SimpleDateFormat(pattern2);


        Scanner s = new Scanner(System.in);

        Date inDate = null;
        
        // 화면으로 부터 날짜를 입력 받는다.
        do{
            System.out.println("날짜를" + pattern1 + "의 형태로 입력해주세요. (입력예 : 2017/05/11)");
            try {
                System.out.print(">>>");
                inDate = sdf.parse(s.nextLine());
                break;


            }
            catch(Exception e){
                System.out.println("다시 입력하세요.");
            }
        }
        while(true);

        System.out.println(sdf2.format(inDate));

    }
}
