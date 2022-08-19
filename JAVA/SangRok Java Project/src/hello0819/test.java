package hello0819;

import java.util.*;

public class test {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        //map에 데이터 저장 //(타입, 0)
        for(String sur : survey){
            map.put(sur.substring(0, 1), 0);
            map.put(sur.substring(1), 0);
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

        ArrayList<Integer> valueTemp = new ArrayList<>();
        ArrayList<String> typeTemp = new ArrayList<>();
        boolean loop = false;

        for(String key : map.keySet()){

            loop = false;

            if(valueTemp.isEmpty()){ // 맨 처음 반복문이 돌 때
                valueTemp.add(map.get(key));
                typeTemp.add(key);
            }
            else{
                // map의 값을 비교
                for(int i = 0; i < valueTemp.size(); i++){
                    if(loop == true){
                        break;
                    }

                    if(valueTemp.get(i) < map.get(key)){ // 템프 보다 크면
                        valueTemp.add(i, map.get(key));
                        typeTemp.add(i, key);
                        break;
                    }
                    else if (valueTemp.get(i) > map.get(key)){ // 템프 보다 작으면

                        for(int j = i; j < valueTemp.size(); j++){
                            if(loop == true){
                                break;
                            }

                            if(valueTemp.get(j) < map.get(key) && valueTemp.get(j-1) > map.get(key)){ //중간에 들어가는 계산식
                                valueTemp.add(j, map.get(key));
                                typeTemp.add(j, key);
                                loop = true;
                                break;
                            }
                            else if(valueTemp.get(j).equals(map.get(key))){ // 같으면

                                for(int z = valueTemp.indexOf(map.get(key));  z < valueTemp.lastIndexOf(map.get(key)); z++){ // 같은 값안에서 사전순으로 비교

                                    if(typeTemp.get(z).compareTo(key) > 0){ // 사전순으로 타겟이 앞에 있을 때
                                        valueTemp.add(z, map.get(key));
                                        typeTemp.add(z, key);
                                        loop = true;
                                        break;
                                    }
                                    else if(typeTemp.get(z).compareTo(key) < 0 && typeTemp.get(z+1).compareTo(key) > 0){ // 사전순으로 타겟이 작을 때
                                        valueTemp.add(z+1, map.get(key));
                                        typeTemp.add(z+1, key);
                                        loop = true;
                                        break;
                                    }
                                    else if(z == valueTemp.lastIndexOf(map.get(key))-1) { // 사전순으로 제일 뒤에 있을 때
                                        valueTemp.add(valueTemp.lastIndexOf(map.get(key)), map.get(key));
                                        typeTemp.add(valueTemp.lastIndexOf(map.get(key)), key);
                                        loop = true;
                                        break;
                                    }
                                }
                            }
                            else if(j == valueTemp.size() -1){
                                valueTemp.add(j+1, map.get(key));
                                typeTemp.add(j+1, key);
                                loop = true;
                                break;
                            }
                        }

                    }
                    else{ // 템프랑 같으면

                        if(typeTemp.get(i).compareTo(key) > 0){ // 사전순 타겟이 앞에 있을 때
                            valueTemp.add(i, map.get(key));
                            typeTemp.add(i, key);
                            break;
                        }
                        else if(typeTemp.get(i).compareTo(key) < 0){ // 사전순으로 타겟이 뒤에 있을 때
                            valueTemp.add(i+1, map.get(key));
                            typeTemp.add(i+1, key);
                            break;
                        }
                        else{ // 사전순으로 같을 수 없다. 중복되는 키가 없으니까
                            System.out.println("Error");
                            break;
                        }

                    }
                }
            }
        }
        
        for(String type : typeTemp){
            answer += type;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] surv = new String[]{"AN", "CF", "MJ", "RT", "NA"};
        int[] choi = new int[]{5, 3, 2, 7, 5};

        System.out.println(solution(surv, choi));
    }
}
