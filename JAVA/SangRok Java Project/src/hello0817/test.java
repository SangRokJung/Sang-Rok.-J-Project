package hello0817;

import java.util.*;

public class test {
    public static int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length-1; i++){
            
            if(arr[i] != arr[i+1]){
                list.add(arr[i]);
            }
            if(i == arr.length-2){
                list.add(arr[arr.length-1]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {

        int[]  arr = new int[]{1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }
}
