package hello0623;

import hello0623.generic.*;

public class gnExam2 {
    public static void main(String[] args) {
        box<String> sBox = new box<>();
        sBox.set(new String("Rain"));

        box<box<String>> bBox = new box<>();
        bBox.set(sBox);

        System.out.println(bBox.get().get());

        box<box<box<String>>> bbBox = new box<>();
        bbBox.set(bBox);
        System.out.println(bbBox.get().get().get());
    }
}
