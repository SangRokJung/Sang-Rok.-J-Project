// package hello0801;

// import java.util.*;

// public class Ex12_4 {
//     FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();

//     // Fruit2와 그 자손들을 다를 수 있다.
//     FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();

// class FruitBox<T>{
//     static <T> void sort(List<T> list, Comparator<? super T> c){
//         ...
//     }
// }

// FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
// FruitBox<Apple> appleBox = new FruitBox<Apple>();

// System.out.println(Juicer.<Fruit>makeJuice(fruitBox)));
// System.out.println(Juicer.<Apple>makeJuice(appleBox)));


// }
