package hello0603;

import java.util.Scanner;


public class qudraticAr3 {

    public static void main(String[] args) {
        String[][] words = {
            {"chair", "의자"},
            {"Computer", "컴퓨터"},
            {"integer", "정수"}
        };

        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i< words.length; i++) {
                String tmp = scanner.nextLine();

                if(tmp.equals(words[i][1])) {
                    System.out.println("같다.");
                }
                else{
                    System.out.println("다르다.");
                }
            }
        }
    }
}