package hello0909;

import java.util.*;

public class test {
    public static int solution(String dartResult) {
        int answer = 0;
        boolean pass = false;
        char[] chaList = dartResult.toCharArray();
        int index = 0;
        int [] score = new int[]{0, 0, 0};

        // 10D4S10D
        for(int i = 0; i < chaList.length; i++) {
            if(pass == true){pass = false; continue;}
            if(chaList[i] >= '0' && chaList[i] <= '9') {
                if(chaList[i] == '1' && chaList[i+1] == '0'){
                    score[index] = 10;
                    index++;
                    pass = true;
                }
                else{
                    score[index] = chaList[i] - '0';
                    index++;
                }
            }
            else if(chaList[i] == 'S'){continue;}
            else if(chaList[i] == 'D'){
                score[index-1] = (int) Math.pow(score[index-1], 2);
            }
            else if(chaList[i] == 'T'){
                score[index-1] = (int) Math.pow(score[index-1], 3);
            }
            else if(chaList[i] == '*'){
                if(index >= 2){
                    score[index-2] *= 2;
                    score[index-1] *= 2;
                }else{
                    score[index-1] *= 2;
                }

            }
            else if(chaList[i] == '#'){
                score[index-1] *= -1;
            }
        }

        answer = score[0] + score[1] + score[2];
        return answer;
    }
    public static void main(String[] args) {
        String str = "1S*2T*3S";
        System.out.println(solution(str));
    }
}
