package hello0803;

import java.util.*;

public class test {
    public static int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> lottosSet    = new HashSet<Integer>();
        HashSet<Integer> win_numSet   = new HashSet<Integer>();

        for(int i = 0; i < lottos.length; i++) {
            lottosSet.add(lottos[i]);
        }
        for(int i = 0; i < win_nums.length; i++){
            win_numSet.add(win_nums[i]);
        }
        
        



        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = new int[]{44, 1, 0, 0, 31,25};
        int[] win_numbs = new int[]{31, 10, 45, 1, 6, 19};

        solution(lottos, win_numbs);
    }
}
