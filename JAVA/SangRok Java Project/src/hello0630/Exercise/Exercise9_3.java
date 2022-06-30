package hello0630.Exercise;

public class Exercise9_3 {
    public static int count(String src, String target){
        int count = 0;
        int pos = 0;

        for(int i = pos; i < src.length(); i++){
            if(src.indexOf(target, pos) > 0){
                count++;
                pos += target.length();
            }
        }

        return count;
    }   

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}
