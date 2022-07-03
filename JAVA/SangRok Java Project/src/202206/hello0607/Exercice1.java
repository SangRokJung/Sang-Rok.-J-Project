package hello0607;

public class Exercice1 {

    
    public static int addArray(int[] arr){
        int result = 0;

        for(int val : arr){
            result += val;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int result = addArray(arr);

        System.out.println(result);
    }
}
