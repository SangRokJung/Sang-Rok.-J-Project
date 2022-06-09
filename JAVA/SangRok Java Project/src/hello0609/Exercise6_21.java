package hello0609;

public class Exercise6_21 {
    public static int abs (int data){
        int result = 0;

        if(data < 0){
            result = data * -1;
        }
        else{
            result = data;
        }

        return result;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 : " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 : " + abs(value));
    }
}
