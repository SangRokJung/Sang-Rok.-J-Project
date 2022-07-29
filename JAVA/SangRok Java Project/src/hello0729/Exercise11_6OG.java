package hello0729;

import java.util.*;

// 다음 예제의 빙고판은 1~30 사이의 숫자들로 만든것이다
// 숫자들의 위치가 잘 섞이지 않는다는 문제가 있다.
// 이러한 문제가 발생하는 이유와 이 문제를 개선하기 위한 방법을 설명하고 이를 개선한 새로운 코드를 작성.

public class Exercise11_6OG {
    public static void main(String[] args) {
        Set set = new HashSet();    // HashSet : 순서유지 안되고 중복허용 안됨.
        int[][] board = new int[5][5];

        // set의 사이즈가 25가 될 때 까지 1~30의 난수를 입력.
        // 중복허용안됨.
        for(int i = 0; set.size() < 25; i++){
            set.add((int)(Math.random() * 30) + 1 + "");
        }

        Iterator it = set.iterator();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = Integer.parseInt((String) it.next());     // Iterator를 이용하여 set의 다음 데이터를 Integer와 시켜 board에 넣는다.
                System.out.print((board[i][j] < 10 ? "  " : " " ) + board[i][j]);
            }
            System.out.println();
        }
    } //main
}
