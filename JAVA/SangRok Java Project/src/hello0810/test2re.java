package hello0810;

import java.util.*;

public class test2re {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> partList = new ArrayList<>();
        ArrayList<String> compList = new ArrayList<>();

        
        for(int i = 0; i < participant.length; i++) {
            partList.add(participant[i]);
        }

        for(int i = 0; i < completion.length; i++){
            compList.add(completion[i]);
        }
        
        while(!compList.isEmpty()){

            if(partList.contains(compList.get(0))){
                partList.remove(compList.get(0));
                compList.remove(0);
            }
        }

        answer = (String) partList.get(0);
        return answer;
    }
    //계산 시간 초과

    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }
}
