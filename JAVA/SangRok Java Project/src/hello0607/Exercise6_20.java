package hello0607;

import java.util.Arrays;

public class Exercise6_20 {
    public static int max(){
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[] {}));
    }
}
