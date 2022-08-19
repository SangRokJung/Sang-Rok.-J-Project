// package hello0818;
// import java.util.*;

// public class test2 {
//     public String solution(String[] survey, int[] choices) {
//     String answer = "";
        
//     HashMap<String, Integer> map = new HashMap<>();
    
//     //map에 데이터 저장 //(타입, 0)
//     for(String sur : survey){
//         map.put(sur.substring(0, 0), 0);
//         map.put(sur.substring(1), 0);
//     }
    
//     int[][] score = new int[map.size()][2]; // [[타입, 점수], [타입, 점수]...]
    
//     // score에 타입저장.
//     int index = 0;
//     for(String type : map.keySet()){
//         score[index][0] = type;
//         index++;
//     }
    
//     //map에 점수 데이터 저장
//     for(int i = 0; i < choices.length; i++){
//         String a = survey.substring(0, 0);
//         String b = survey.subString(1);
    
//         switch(choices[i]){
//             case 1 : map.replace(a, map.get(a) + 3);
//                 break;
//             case 2 : map.replace(a, map.get(a) + 2);
//                 break;
//             case 3 : map.replace(a, map.get(a) + 1);
//                 break;    
//             case 4 : 
//                 break;
//             case 5 : map.replace(b, map.get(b) + 1);
//                 break;
//             case 6 : map.replace(b, map.get(b) + 2);
//                 break;
//             case 7 : map.replace(b, map.get(b) + 3);
//                 break;
//         }
        
//         // score에 점수저장.
//         for(int j = 0; j < score.length; j++){
            
//             if(score[j][0].eqauls(a)){
//                 score[j][1] += map.get(a);
//             }
//             else if(score[j][0].equals(b)){
//                 score[j][1] += map.get(b);
//             }
//             else{
//                 continue;
//             }
//         }
//     }
    
//     // 점수만 저장
//     ArrayList scoreList = new ArrayList();
    
//     for(int[] socre : socre){
//         socreList.add(score[1]);
//     }
    
//     //오름차순 정렬
//     Collections.sort(scoreList);
    
//     for(String key : map.keySet()){
        
//         if(answer.length == 4){
//             break;
//         }
        
//         for(int i = scoreList.size(); i > 0; i--){
            
//             if(map.get(key) == scoreList.get(i)){
//                 answer += key;
//             }
//         }
//     }

    
//     return answer;
// }
