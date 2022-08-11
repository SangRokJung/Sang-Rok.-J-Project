package hello0810;

import java.util.*;

public class test2re2 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        LinkedList<String> partList = new LinkedList<>();

        for(int i = 0; i < participant.length; i++) {
            partList.add(participant[i]);

            if(i == (participant.length -1)){
                break;
            }
            if(partList.contains(completion[i])){
                partList.remove(0);
            }
        }

        

        answer = (String) partList.get(0);
        return answer;
    }


    public static void main(String[] args) {
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion  = new String[]{"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution(participant, completion));
    }
}
