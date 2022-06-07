package hello0606;

public class Exersice6_17 {

    public static int[] shuffle(int[] _x){
        if(_x ==null || _x.length == 0){
            return _x;
        }

        for(int i=0; i<_x.length; i++){
            int ranNum = (int)(Math.random() * _x.length);

            int temp = _x[i];
            _x[i] = _x[ranNum];
            _x[ranNum] = temp;
        }
        return _x;
    }


    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
