package hello0602;

/**
 * day
 */
public class strbuilderReplace {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Day");

        sb.append("Tuesday").append("Sunday").append("Wednesday");

        //인덱스 1~5를 HELLO로 바꿈
        sb.replace(1, 5, "HELLO");

        System.out.println(sb);

        
    }
}