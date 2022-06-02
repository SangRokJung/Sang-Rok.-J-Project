package hello0602;

/**
 * day
 */
public class strSubstring {

    public static void main(String[] args) {
        
        String day = "monday";

        //2번 인덱스 부터 리턴
        System.out.println(day.substring(2));

        //2번 인덱스 부터 4번 인덱스 까지 리턴
        System.out.println(day.substring(2, 4));

    }
}