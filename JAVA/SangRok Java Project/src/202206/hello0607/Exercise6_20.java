package hello0607;

import java.util.Arrays;

public class Exercise6_20 {
    public static int max(int[] data){
        int result = 0;

        if(data == null || data.length == 0){
            result = -999999;
        }
        else{
            for(int i = 0; i < data.length; i++){
                for(int j = i+1; j < data.length; j++){
                    if(data[i] > data[j]){
                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
            result = data[data.length-1];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값1 : " + max(data));
        System.out.println("최대값2: " + max(null));
        System.out.println("최대값3 : " + max(new int[] {}));
    }
}
