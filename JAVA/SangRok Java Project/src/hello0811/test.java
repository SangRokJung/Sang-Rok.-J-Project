package hello0811;

import java.util.*;

public class test {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : d){
            list.add(i);
        }
        
        // d를 오름차순으로 정렬
        Collections.sort(list);
        
        // 인덱스 1부터 차례대로 덧셈.
        int sum = 0;
        
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
            
            // if budget보다 커지면 덧셈 중단
            // 중단된 인덱스에서 -1을 answer로 저장. return.
            if(sum > budget){
                answer = i;
                return answer;
            }
        }
        
        // for문을 다 돌면 list의 사이즈 만큼 answer에 저장.
        answer = list.size();

        return answer;
    }

    public static void main(String[] args) {
        int[] d = new int[]{1,3,2,5,4};
        int budget = 9;

        solution(d, budget);
    }
}
