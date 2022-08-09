package hello0809;

public class test2 {

    public static int solution(String s) {
        int answer = 0;
        String s1 = "";

        s1 = s.replaceAll("one", "1");

        answer = Integer.parseInt(s1);
        
        return answer;
    }
    

    public static void main(String[] args) {
        String s = "one";

        System.out.println(solution(s));
    }
}