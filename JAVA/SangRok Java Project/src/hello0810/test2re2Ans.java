package hello0810;

import java.util.*;

public class test2re2Ans {
    public static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> result = new HashMap<>(); //iterator 못씀.

        for(String player : participant){
            int count = 0;  //value
            Integer value = result.get(player); // get() : key의 값을 반환.
            
            if(value != null){  // value가 null이 아니라면
                count = value;  // count에 value를 저장한다.
            }

            result.put(player, ++count);    // put(key, value) : Map에 value객체를 key객체에 연결(mapping)하여 저장한다.
        }


        for(String player : completion){

            int count = result.get(player);     // result의 key에서 completion player에 해당하는 value를 가져온다.

            if(count == 1){
                result.remove(player);  // remove() : 지정한 key객체와 일치하는 key-value객체를 삭제한다.
            }
            else{
                result.put(player, --count);
            }
        }


        String answer = result.keySet().iterator().next();
        return answer;
    }



    public static void main(String[] args) {
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion  = new String[]{"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution(participant, completion));
    }
}
