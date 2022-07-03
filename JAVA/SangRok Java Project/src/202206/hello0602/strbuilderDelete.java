package hello0602;

/**
 * day
 */
public class strbuilderDelete {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Day");

        sb.append("Tuesday").append("Sunday").append("Wednesday");

        sb.delete(5, 8);

        System.out.println(sb);
    }
}