package hello0715;

import java.text.*;

public class DecimalFormatSample {
    // 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능
    // 숫자, 날짜 => 형식 문자열
    // decimal = 10진수

    public static void main(String[] args) {
        // 숫자, 날짜 => 형식 문자열의 예
        double number = 123456.789;
        DecimalFormat df = new DecimalFormat("#.#E0");
        String result = df.format(number);


        // 형식 문자열 => 숫자, 날짜
        DecimalFormat df2 = new DecimalFormat("#,###.##");
        Number num = df2.parse("1,234,567,89");
        double d = num.doubleValue();
        //Number는 모든 숫자 Class의 최고 조상.
        
        // * Integer.parseInt()는 ,가 포함된 문자열을 숫자로 변환 못한다.
        // * Float.parseFloat()도 마찬가지.

    }


}
