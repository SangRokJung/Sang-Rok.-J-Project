package hello0602;

/**
 * day
 */
public class strCompare {

    public static void main(String[] args) {
        
        String day = "monday";
        String day1 = "1wednesday";
        
        int comp = day.compareTo(day1);

        System.out.println(comp);

        if(comp == 0){
            System.out.println("Same");
        }
        else if(comp > 0){
            System.out.println("사전앞에 있는 경우");
        }
        else if(comp < 0){
            System.out.println("사전상 뒤에 있는 경우");
        }

        
    }
}