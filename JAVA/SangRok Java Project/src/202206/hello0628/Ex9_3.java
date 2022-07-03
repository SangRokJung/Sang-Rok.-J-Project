package hello0628;

public class Ex9_3 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        
        // 객체의 주소값으로 HashCode를 생성하기 때문에 모든 객체에 대해
        // 항상 다른 hashcode값을 반환 하는것을 보장한다.
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));


    }
}
