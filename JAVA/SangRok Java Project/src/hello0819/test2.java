package hello0819;

import java.util.*;

public class test2 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : array){
            list.add(i);
        }
        
        for(int i = 0; i < commands.length; i++){
            answer[i] = find(list, commands[i][0], commands[i][1], commands[i][2]);
        }

        
        return answer;
    }
    
    public static int find(List<Integer> list, int start, int end, int index){
        
        ArrayList<Integer> newList = new ArrayList<>();
        

        if(start == end){
            newList.add(list.get(start-1));
        }
        else{
            newList.addAll(list.subList(start-1, end));
        }

        Collections.sort(newList);
        
        return newList.get(index-1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution(array, commands);
    }
}
