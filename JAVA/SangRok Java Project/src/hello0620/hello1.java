package hello0620;

public class hello1 {

    public static void main(String[] args) {
        intV a1 = new intV();
        intV a2 = new intV();

        person p = new person("jung");
    
        a1.value = 2;
        a2.value = 2;

        if(a1 == a2){   //정답은 당연히 다르죠.
            System.out.println("같다");
        }
        else{
            System.out.println("다르다.");
        }   

        if(a1.value == a2.value){   //정답은 당연히 같죠.
            System.out.println("같다");
        }
        else{
            System.out.println("다르다.");
        }   

        if(a1.equals(a2)){   //정답은 당연히 같죠.
            System.out.println("같다");
        }
        else{
            System.out.println("다르다.");
        }   

    }
}
