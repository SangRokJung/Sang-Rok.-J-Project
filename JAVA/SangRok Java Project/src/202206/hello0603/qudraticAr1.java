package hello0603;

/**
 * qudraticAr
 */
public class qudraticAr1 {

    public static void main(String[] args) {
        int[][] score = {   {100, 90, 30},
                            {20, 50, 30},
                            {39, 59, 29}
                        };

        int sum = 0;

        for(int i = 0; i < score.length; i++) {
            for(int j= 0; j <score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}