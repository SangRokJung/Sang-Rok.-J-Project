package hello0817;

public class test3 {
    
}

class Solution {
    public static int solution(int[][] sizes) {
        int maxNum = 0;
        int minNum = 0;    
    
        for(int[] i : sizes){
            int maxStemp = Math.max(i[0], i[1]);
            int minStemp = Math.min(i[0], i[1]);

            if(maxStemp > maxNum){
                maxNum = maxStemp;
            }

            if(minStemp > minNum){
                minNum = minStemp;
            }
        }

        return maxNum * minNum;

    }
    public static void main(String[] args) {
        int[][] i = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(i);
    }
}
