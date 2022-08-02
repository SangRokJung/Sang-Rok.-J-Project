// package hello0801;

// public class ex1 {
//     class Box<T> {
//         static T item;  // 에러
//         static int compare(T t1, T t2){ // 에러
//             ...
//         }               
//     }
// }

// class Box<T> {
//     T[] itemArr;    //OK, T타입의 배열을 위한 참조변수

//     T[] toArray() {
//         T[] tmpArr = new T[itemArr.length];     //Error, 지네릭 배열 생성불가
//     }
// }
