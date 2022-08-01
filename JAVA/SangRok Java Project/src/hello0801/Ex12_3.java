package hello0801;

import java.util.*;

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}
class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}
class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable{

}

public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>();   // Error, 타입 불일치
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); // Error.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape());  // Error, Grape는 Apple의 자손이 아니다.
        grapeBox.add(new Grape());

        System.out.println("fruitBox - " + fruitBox);
        System.out.println("appleBox - " + appleBox);
        System.out.println("grapeBox - " + grapeBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> { // Fruit을 상속받고 eatable interface를 구현해야는 조건 제약
    // &로 사용
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();     //item을 저장할 list.
    void add(T item) {  //박스에 item 추가
        list.add(item);
    }
    T get(int i) {      // 박스에서 item 꺼낼때
        return list.get(i);
    }
    int size() {        
        return list.size();
    }
    public String toString() {
        return list.toString();
    }
}