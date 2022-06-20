package hello0620;

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        person p1 = new person("Jung");
        person p2 = new person("Hong");

        p1 = null;

        System.out.println(p2.getName());

        scanner.nextInt();

    }
}
