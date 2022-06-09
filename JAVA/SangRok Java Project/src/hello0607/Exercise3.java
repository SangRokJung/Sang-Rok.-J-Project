package hello0607;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static int[][] add(int[][] multiDim1, int[][] multiDim2, String order){
        int [][] result = new int[multiDim1.length][multiDim1[0].length];

        if(order.equals("plus")){
            for(int i = 0; i < multiDim1.length; i++){
                for(int j = 0; j < multiDim1[i].length; j++){
                    result[i][j] = multiDim1[i][j] + multiDim2[i][j];
                }
            }
        }
        else if (order.equals("minus")){
            for(int i = 0; i < multiDim1.length; i++){
                for(int j = 0; j < multiDim1[i].length; j++){
                    result[i][j] = multiDim1[i][j] - multiDim2[i][j];
                }
            }
        }
        else{
            result = null;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString;


        int[][] m1 = new int [2][2];
        int[][] m2 = new int [2][2];


        System.out.println("첫번째 행렬을 입력하세요.");
        inputString = sc.nextLine();

        String[] str = inputString.split(" ");
        
        m1[0][0] = Integer.parseInt(str[0]);
        m1[0][1] = Integer.parseInt(str[1]);
        m1[1][0] = Integer.parseInt(str[2]);
        m1[1][1] = Integer.parseInt(str[3]);


        System.out.println("두번째 행렬을 입력하세요.");
        inputString = sc.nextLine();

        String[] str1 = inputString.split(" ");
        
        m2[0][0] = Integer.parseInt(str1[0]);
        m2[0][1] = Integer.parseInt(str1[1]);
        m2[1][0] = Integer.parseInt(str1[2]);
        m2[1][1] = Integer.parseInt(str1[3]);


        System.out.println("Enter the plus or minus.");
        inputString = sc.nextLine();


        int[][] result = add(m1, m2, inputString);

        if(result != null){
            System.out.println(Arrays.toString(result[0]));
            System.out.println(Arrays.toString(result[1]));
        }
    }
}
