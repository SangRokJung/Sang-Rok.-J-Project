package hello0616;

public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());

        t.setChannel(30);
        System.out.println("CH : " + t.getChannel());

        // t.setVolume(20);
        // System.out.println("Vol : " + t.getVolume());

        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
    }
}
