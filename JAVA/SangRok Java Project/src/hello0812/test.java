package hello0812;

import java.util.*;

public class test {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, Integer> map = new HashMap<>(); // ID, 신고당한 횟수
        HashMap<String, Integer> mapMail = new HashMap<>(); // ID, 받아야할 메일 갯수
        HashSet<String> set = new HashSet<>(); // report의 중복 방지.


        // report를 신고자와 신고유저로 분리
        for(String r : report){
            set.add(r);
        }
        String[] reports =  new String[2];



        // map에(ID, 신고당한 횟수)로 저장
        // mapMail(ID, 받아야할 메일 겟수)로 저장
        for(String id : id_list){
            map.put(id, map.getOrDefault(id, 0));
            mapMail.put(id, mapMail.getOrDefault(id, 0));
        }


        // map에 신고당한 횟수 증가
        for(String s : set){
            reports = s.split(" "); // reports[0] = 신고한 유저 
                                    // reports[1] = 신고 당한 유저

            map.replace(reports[1], map.get(reports[1]) + 1);

            // 데이터 저장 check.
            // System.out.println(reports[1] + " : " + map.get(reports[1])); 
            
        }


        for(String s : set){
            reports = s.split(" "); // reports[0] = 신고한 유저  
                                    // reports[1] = 신고 당한 유저

            if(map.get(reports[1]) >= k){   // k보다 많은 신고횟수를 가진 계정 확인

                // 신고를 한 유저의 값을 증가.
                mapMail.replace(reports[0], mapMail.get(reports[0]) + 1);

                // 데이터 저장 check.
                // System.out.println(reports[0] + " : " + mapMail.get(reports[0])); // 순서 X

            }
        }


        // 신고한 유저가 받아야 할 메일의 겟수를 반환.
        for(String key : mapMail.keySet()){  // 순서 없음.

            for(int i = 0; i < id_list.length; i++){  // 순서 존재

                if(id_list[i].equals(key)){

                    answer[i] = mapMail.get(key);
                    break;
                }
            }
        }
        return answer;
    }
}




