package hello0809;

public class test {

    public static int solution(String s) {
        int answer = 0;
        String str = s;

        String[] strArr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numArr = new String[]{"0" ,"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0; i < 10; i++){
            
            if(str.contains(strArr[i])){

                str.replace(strArr[i], numArr[i]);
            }
        }
        
        System.out.println(str);

        answer = Integer.parseInt(str);
        
        return answer;
    }
    

    public static void main(String[] args) {
        String s = "one4seveneight";

        solution(s);
    }
}
