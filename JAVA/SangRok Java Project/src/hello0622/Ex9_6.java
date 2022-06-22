package hello0622;

public class Ex9_6 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        if(str1 == str2)
            System.out.println("true");
        else   
            System.out.println("false");



        String str3 = new String("abc");
        String str4 = new String("abc");


        if(str3 == str4)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
