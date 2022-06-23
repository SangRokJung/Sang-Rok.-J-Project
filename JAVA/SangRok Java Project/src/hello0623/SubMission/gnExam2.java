package hello0623.SubMission;

public class gnExam2 {
    public static void main(String[] args) {
        box<box> bb = new box<box>();
        box b1 = new box("hi");
        bb.set(b1);

        box<box> bbb = new box<box>();

        bbb.set(bb);

        System.out.println(bbb);
    }
}
