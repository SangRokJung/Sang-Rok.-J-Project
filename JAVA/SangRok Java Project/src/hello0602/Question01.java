package hello0602;

public class Question01 {
    public static void main(String[] args) {
        String num = "801010-1001234";

        StringBuilder sb = new StringBuilder(num);

        sb.delete(6, 7);
        System.out.println(sb);
    }
}
