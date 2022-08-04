package hello0804;

import java.util.*;

public class test {
    // 당첨 가능한 (최고 순위)와 (최저 순위)를 반환.
    public static int[] soulution(int[] lottos, int[] win_nums){
        // 답.
        int[] answer = new int[2];

        // set : 데이터의 중복 저장을 허용하지 않는다.
        HashSet<Integer> lottoNum = new HashSet<Integer>();
        HashSet<Integer> win_num = new HashSet<Integer>();

        int checkCnt = 0;   //0을 제외한 로또 번호가 맞은 횟수
        int zeroCnt = 0;    // 0의 횟수


        // lottoNum에 lottos의 번호들을 입력.
        for(int i : lottos){
            lottoNum.add(i);

            if(i == 0){ // 0이 있는 경우
                zeroCnt += 1;
            }
        }

        // win_num에 win_nums를 입력.
        for(int i : win_nums){
            win_num.add(i);
        }

        // 0을 제외한 로또 번호가 맞은 횟수 검사.
        lottoNum.retainAll(win_num);
        checkCnt = lottoNum.size();

        int maxLank = lankCheck(checkCnt + zeroCnt); // 가장 높은 등수
        int minLank = lankCheck(checkCnt); //가장 낮은 등수

        answer[0] = maxLank;
        answer[1] = minLank;

        return answer;
    }

    public static int lankCheck(int num){
        int lank;

        if(num == 2){
            lank = 5;
        }
        else if(num == 3){
            lank = 4;
        }
        else if(num == 4){
            lank = 3;
        }
        else if(num == 5){
            lank = 2;
        }
        else if(num == 6){
            lank = 1;
        }
        else{
            lank = 6;
        }

        return lank;
    }


    public static void main(String[] args) {
        int[] lottos = new int[] {44, 1, 0, 0, 31, 25};
        int[] win_nums = new int[] {31, 10, 45, 1, 6, 19};

        System.out.println(soulution(lottos, win_nums));
    }
}
