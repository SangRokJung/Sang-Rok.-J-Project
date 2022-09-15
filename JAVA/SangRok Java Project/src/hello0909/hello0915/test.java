class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str = String.valueOf(n);
            
        answer = str.split("");
        
        System.out.println(String.valueOf(n));
        
        return answer;
    }
}