package hello0606;

public class Exersice6_17 {
    public int[] shuffle(int[] _x){
        int[] arr;

        for(int i=0; i< _x.length; i++){
            int ranNum = (int)(Math.random() * 10) + 1;
            arr[i] = _x[ranNum];
        }

        return 

    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.asList(result));
    }
}
