package hello0809;
import java.util.*;

public class test3 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> list = new LinkedList<>();
        int[][] boards = board;
        int[] moving = moves;
    
        for(int j = 0; j < moving.length; j++){
            
            for(int i = 0; i < 5; i++){
            
                if(boards[i][moving[j] - 1] > 0){
                
                    list.add(boards[i][moving[j] - 1]);
                    
                    boards[i][moving[j] - 1] = 0;
                    
                    break;
                }
            }            
        }
        



        for(int i = 0; i < list.size() - 1; i ++){
            
            if(list.get(i).equals(list.get(i+1)) ){
                list.remove(i);
                list.remove(i);
                answer += 2;
                i = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] boards = new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moving = new int[] {1,5,3,5,1,2,1,4};

        System.out.println(solution(boards, moving)); 
    }
}
