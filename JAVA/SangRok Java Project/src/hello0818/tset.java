package hello0818;
import java.util.*;

public class tset {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        HashMap<Integer, String> map = new HashMap<>();
        
        // map에 데이터 저장 (번호, 손)
        for(int i = 0; i < 10; i++){
        
            if(i == 1 || i == 4 || i == 7){
                map.put(i, "L");
            }
            else if(i == 3 || i == 6 || i == 9){
                map.put(i, "R");
            }
            else if(i == 2 || i == 5 || i == 8 || i == 0){
                map.put(i, "M");
            }
        }
        
        // 키패드 생성
        int[][] keypad = new int[][]{{1, 2, 3}, //[3][2]
                                    {4, 5, 6}, 
                                    {7, 8, 9}, 
                                    {10, 0, 11}};
                                    
        
        // 현재 손가락 위치
        int leftFing = 10;
        int rightFing = 11;
        
        // 거리차이
        int leftDistance = 0;
        int rightDistance = 0;
        
        for(int num : numbers){
        
            // distance = find(keypad, num)
        
            if(map.get(num) == "L"){ //좌측인경우
                answer += "L";
                leftFing = num;
            }
            else if(map.get(num) == "R"){ //우측인경우
                answer += "R";
                rightFing = num;
            }
            else{ //(map.get(num) == "M") // 가운데인경우
                
                leftDistance = distanceDiff(find(keypad, num), find(keypad, leftFing));
                rightDistance = distanceDiff(find(keypad, num), find(keypad, rightFing));
                
                if(leftDistance > rightDistance){ //오른손이 더 가깝다.
                    answer += "R";
                    rightFing = num;
                }
                else if(leftDistance < rightDistance){ //왼손이 더 가깝다.
                    answer += "L";
                    leftFing = num;
                }
                else{ //(leftDistance == rightDistance) //거리차가 같다.
                    if(hand.equals("right")){ // 손이 오른손인경우
                        answer += "R";
                        rightFing = num;
                    }
                    else{ //hand == "Left" // 손이 왼손인경우
                        answer += "L";
                        leftFing = num;
                    }
                }           
            }
        }
    
        
        
        return answer;
    }
    
    // 번호의 인덱스를 뽑는다. [][]
    public static int[] find(int[][] numbs, int target){
        int[] result = new int[2];
        
        for(int i = 0; i < numbs.length; i++){ //3
            
            for(int j = 0; j < numbs[0].length; j++){ //2
                
                if(numbs[i][j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    
    // 인덱스의 차이를 계산한다.
    public static int distanceDiff(int[] criteria, int[] target){

        return Math.abs((criteria[0] - target[0])) + Math.abs((criteria[1] - target[1]));
    }

    public static void main(String[] args) {
        int[] numbs = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution(numbs, "right"));
    }
}

