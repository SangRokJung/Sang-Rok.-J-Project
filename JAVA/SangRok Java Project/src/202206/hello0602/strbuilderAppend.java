package hello0602;

/**
 * day
 */
public class strbuilderAppend {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("day");

        StringBuilder a = sb.append(10);
        
        System.out.println(sb);
        if(a == sb){
            System.out.println("같다");
        }

        a.append("tuesday").append("sunday");

        System.out.println(a);
    }
}