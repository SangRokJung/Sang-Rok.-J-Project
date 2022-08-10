package hello0809;

import java.util.*;

public class test4 {
    public static int solution(int[][] board, int[] moves) {

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        // stack에 뽑인 인형을 넣고 겹치는 인형을 제거한다.
        for(int move : moves) {

            for(int i = 0; i < board.length; i++){

                if(board[i][move - 1] != 0){

                    if(stack.isEmpty()) {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }

                    if(stack.peek() == board[i][move - 1]){
                        stack.pop();
                        answer = answer + 2;
                        board[i][move - 1] = 0;
                        break;
                    }   
                    else{
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }
                }
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
