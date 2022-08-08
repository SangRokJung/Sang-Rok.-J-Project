package hello0808;

import java.util.*;

public class codingtestRetry {
    public static int[] solution(int[] numbers) {   
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();


        // 인덱스 끼리 더한 값을 중복제거 하면서 set에 저장.
        for(int i = 0; i < numbers.length - 1; i++) {

            for(int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        list.addAll(set);

        // 오름차순 => ArrayList
        Collections.sort(list);

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 1, 3, 4, 1};

        System.out.println(solution(numbers));
    }
}
