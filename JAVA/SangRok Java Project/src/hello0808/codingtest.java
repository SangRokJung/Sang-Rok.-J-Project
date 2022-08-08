package hello0808;

import java.util.*;

public class codingtest {
    public static int[] solution(int[] numbers) {   
        
        // 서로 다른 인덱스 끼리 더함 => ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        list.addAll(plusIndex(numbers));

        int temp;

        // 중복 제거 => HashSet
        for(int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            set.add(temp);  //중복 거르기
        }

        list.clear();

        list.addAll(set);

        // 오름차순 => ArrayList
        Collections.sort(list);

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    // 모든 인덱스를 더하는 기능
    public static Stack<Integer> plusIndex(int[] numbers) {
        int temp = 0;
        Stack<Integer> stack = new Stack<Integer>();
    

        for(int i = 0; i < numbers.length - 1; i++) {

            for(int j = i; j < numbers.length - 1; j++) {
                temp = numbers[i] + numbers[j+1];
                stack.push(temp);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 1, 3, 4, 1};

        System.out.println(solution(numbers));
    }
}
