package hello0620;

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        person p1 = new person("Jung");
        person p2 = new person("Hong");

        point po1 = new point(45, 2);
        point cpPo = null;

        try{
            cpPo = (point)po1.clone();

            System.out.println(cpPo.Xpos + cpPo.Ypos);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }


        p1 = null;

        System.out.println(p2.getName());

        scanner.nextInt();

    }
}
