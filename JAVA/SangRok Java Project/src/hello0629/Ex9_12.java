package hello0629;

public class Ex9_12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);

        System.out.println("sb = " + sb.toString());
        System.out.println("sb2 = " + sb2.toString());
    }
}
