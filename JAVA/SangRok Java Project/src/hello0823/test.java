package hello0823;

public class test {
    public static int solution(int left, int right) {
        int answer = 0;
        
        
        for(int i = left; i < right+1; i++){
            answer += calc(i);
        }
        
        return answer;
    }
    
    public static int calc(int num){
        int result = 0;
        
        for(int i = 1; i < num+1; i++){
            
            if(num % i == 0){
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        solution(left, right);
    }
}
