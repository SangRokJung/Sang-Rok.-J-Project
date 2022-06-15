package hello0615;

public class Ex7_15 {
    public static void main(String[] args) {
        // 인스턴스 클래스의 인스턴스를 생성하려면
        // 외부 클래스의 인스턴스를 먼저 생성해야 한다.

        Outer2 oc = new Outer2();
        Outer2.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv );

        
        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println("si.iv : " + si.iv);

    }
}
