package hello0819;

import java.util.*;

public class test_2 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();

        String[][] typeArr = new String[][]{{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        
        //map에 데이터 저장 //(타입, 0)
        for(String[] sur : typeArr) {
            map.put(sur[0], 0);
            map.put(sur[1], 0);
        }
        
        //map에 점수 데이터 저장
        for(int i = 0; i < choices.length; i++){
            String a = survey[i].substring(0, 1);
            String b = survey[i].substring(1);
        
            switch(choices[i]){
                case 1 : map.replace(a, map.get(a) + 3);
                    break;
                case 2 : map.replace(a, map.get(a) + 2);
                    break;
                case 3 : map.replace(a, map.get(a) + 1);
                    break;    
                case 4 : 
                    break;
                case 5 : map.replace(b, map.get(b) + 1);
                    break;
                case 6 : map.replace(b, map.get(b) + 2);
                    break;
                case 7 : map.replace(b, map.get(b) + 3);
                    break;
            }

        }



        for(int i = 0; i < typeArr.length; i++){
            answer += typeAdd(map, typeArr[i][0], typeArr[i][1]);
        }


        return answer;
    }

    public static String typeAdd(HashMap<String, Integer> map, String type1, String type2){
        String result = "";

        if(map.get(type1) < map.get(type2)){
            result += type2;
        }
        else if(map.get(type1) > map.get(type2)){
            result += type1;
        }
        else{
            if(type1.compareTo(type2) < 0){
                result += type1;
            }
            else if(type1.compareTo(type2) > 0){
                result += type2;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        String[] surv = new String[]{"AN", "CF", "MJ", "RT", "NA"};
        int[] choi = new int[]{5, 3, 2, 7, 5};

        System.out.println(solution(surv, choi));
    }



}
