package hello0817;

import java.util.*;

public class test2 {
        public int solution(int[][] sizes) {
            int answer = 0;

            ArrayList widthList = new ArrayList();
            ArrayList heightList = new ArrayList();
    
            for(int i = 0; i < sizes.length; i++){
                int j = 0;
    
                // 가로에 큰값, 세로에 작은값 들어간다.
                if(sizes[i][j] > sizes[i][j+1]){
                    widthList.add(sizes[i][j]);
                    heightList.add(sizes[i][j+1]);
                }else{ 
                    widthList.add(sizes[i][j+1]);
                    heightList.add(sizes[i][j]);
                } 
            }

            int maxWidth = (Integer)widthList.get(0);
            int maxHeight = (Integer)heightList.get(0);
    
            for(int i = 1; i < sizes.length; i++){
    
                if(maxWidth < (Integer)widthList.get(i)){
                    maxWidth = (Integer)widthList.get(i);
                }
    
                if(maxHeight < (Integer)heightList.get(i)){
                    maxHeight = (Integer)heightList.get(i);
                }
            }
    
            answer = maxWidth * maxHeight;
            return answer;
        }
    }

