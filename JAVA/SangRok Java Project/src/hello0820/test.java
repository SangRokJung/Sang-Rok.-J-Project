package hello0820;
import java.util.*;
public class test {


class Solution {
    public static int[] solution(int[] answers) {

        int[] answer = new int[]{};

        // (사람, 점수)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i < 4; i++){ //map에 데이터 저장
            map.put(i, 0);
        }
        
        int[] p1 = new int[]{1, 2, 3, 4, 5};
        int[] p2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        int[][] p = new int[][]{{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        
        
        for(int i = 0; i < p.length; i++){
            
            for(int j = 0; j < answers.length; j++){
                
                if(answers[j] == p[i][j]){
                    map.replace(i, map.get(i+1)+1);
                }
            }
        }
        
        if(map.get(1) == map.get(2) && map.get(1) == map.get(3)){
            answer = new int[]{1, 2, 3};
        }
        else{
            
            if(map.get(1) > map.get(2) && map.get(1) > map.get(3)){
                answer = new int[]{1};
            }
            else if(map.get(2) > map.get(1) && map.get(2) > map.get(3)){
                answer = new int[]{2};
            }
            else if(map.get(3) > map.get(1) && map.get(3) > map.get(2)){
                answer = new int[]{3};
            }
        }
        
        
        
       

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
    
        solution(arr);
    }
}


}
