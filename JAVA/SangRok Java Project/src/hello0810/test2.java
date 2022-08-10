package hello0810;

import java.util.*;

public class test2 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Set <String> set = new HashSet<>();
        Stack <String> stack = new Stack<>();

        
        for(int i = 0; i < participant.length; i++) {
            stack.push(participant[i]);
        }

        for(int i = 0; i < completion.length; i++){
            set.add(completion[i]);
        }
        

        Iterator<String> it = stack.iterator();

        while(it.hasNext()){
            
            if(set.contains(stack.peek())){
                set.remove(stack.peek());
                stack.pop();
            }

            if(set.isEmpty()){
                break;
            }
        }

        answer = (String) stack.peek();
        return answer;
    }
    //계산 시간 초과

    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }
}
