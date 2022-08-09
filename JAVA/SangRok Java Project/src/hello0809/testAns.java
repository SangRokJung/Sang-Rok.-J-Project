package hello0809;

import java.util.*;

public class testAns {
    public static int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack[] game = new Stack[board[0].length];  // 스택 배열
        Stack<Integer> bag = new Stack<Integer>();


        for(int i = 0; i<board[0].length; i++){
            game[i] = new Stack<Integer>();
        }
        


        for(int i = board.length-1; i>=0; i--){
            
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] != 0){
                    game[j].push(board[i][j]);
                }
            }
        }

        for(int i = 0; i<moves.length; i++){

            if(game[moves[i]-1].empty()){
                continue;
            }

            int number = (int)game[moves[i]-1].pop();

            if(bag.empty()){
                System.out.printf("%d empty\n", number);
            }
            else {
                System.out.printf("%d %d\n", number, bag.peek());
            }


            if(bag.size() == 0){
                bag.push(number);
            }
            else{
                if(number == bag.peek()){
                    answer+=2;
                    bag.pop();
                }
                else{
                    bag.push(number);
                }
            }
        }

        return answer;
    }
}
