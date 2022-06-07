package hello0607;

import java.util.Arrays;

public class Exercise2 {
    public static String joinArray(int[] arr1, int[] arr2){

        int index = arr1.length + arr2.length;
        int[] result = new int[index];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        int[] _arr1 = {1, 2, 3};
        int[] _arr2 = {4, 5, 6};

        System.out.println(joinArray(_arr1, _arr2));
    }
}
