package hello0628;

public class Ex9_8 {
    public static void main(String[] args) {
        
        // 길이가 0은 char배열 생성
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
