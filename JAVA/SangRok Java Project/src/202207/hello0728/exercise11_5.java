package hello0728;

import java.util.*;

// 다음 SutdaCard Class를 HashSet에 저장하고 출력하는 예제이다. HashSet에 중복된 카드가
// 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩하시오.

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof SutdaCard){
            SutdaCard c = (SutdaCard)obj;
            return num == c.num && isKwang == c.isKwang;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return toString().hashCode();
        // return (int)((num) / 10000);
    }

    @Override
    public String toString(){
        return num + (isKwang ? "K" : "");
    }

    // 대부분의 경우 서로 다른 객체라도 클래스의 인스턴스변수 값이 같으면, 
    // 예를 들어 SutdaCard의 경우 num과 isKwang의 값이 같으면 같은 객체로 인식해야한다. 
    // 즉, equals() 의 결과가 true이어야하고, 두 객체의 해시코드(hashCode()를 호출한 결과)가 같아야 한 다. 
    // 그래서 equals()와 hashCode()를 적절히 오버라이딩 해줘야 한다.
    // 때로는 equals()만 오버라이딩해줘도 되지만, 
    // 해시알고리즘을 사용하는 HashSet에 담을 때는 반드시 hashCode()도 오버라이딩해줘야 한다.

    // String클래스의 hashCode()는 객체의 주소가 아닌 문자열의 내용을 기반으로 해시코드를 생성하므로 
    // 문자열의 내용이 같으면 항상 같은 값의 해시코드를 반환한다.
    // SutdaCard의 toString()이 num과 isKwang의 값으로 문자열을 만들어 반환하기 때문에, 
    // toString()을 호출한 결과에 hashCode()를 호출함으로써 SutdaCard의 hashCode()를 간단히 구현할 수 있었다.
}

public class exercise11_5 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);

    }
}
