package hello0811;

import java.util.HashMap;

public class test2 {

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();

        for (String player : participant){  // 선수들
            hm.put(player, hm.getOrDefault(player, 0) + 1); // key에 선수를 저장, value에 1저장. 
        } 

        for (String player : completion){   // 완주한 선수들
            hm.put(player, hm.get(player) - 1);  // key에 완주한 선수들 저장. value에 완주한 선수들의 value를 불러온 값에 -1을 하여 저장.
        }


        for (String key : hm.keySet()) {    // hm의 key를 반환
            if (hm.get(key) != 0){  // key 해당하는 value를 찾아 0이 아니면. 
                answer = key;   //해당 key를 반환.
            }
        }
        System.out.println();

        return answer;
    }
}
}
