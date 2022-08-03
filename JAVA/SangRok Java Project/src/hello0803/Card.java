// // package hello0803;

// // public class Card {
// //     static final int CLOVER = 0;
// //     static final int HEART = 1;
// //     static final int DIAMOND = 2;
// //     static final int SPADE = 3;

// //     static final int TWO = 0;
// //     static final int THREE = 1;
// //     static final int FOUR = 2;

// //     final int kind;
// //     final int num;
// // }

// // public class Card{
// //     //          0       1       2       3
// //     enum Kind {CLOVER, HEART, DIAMOND, SPADE};
// //     enum Value {TWO, THREE, FOUR};

// //     final Kind kind;
// //     final Value value;

// //     if(Card.CLOVER == Card.TWO)     // true지만 false가 의미상 맞다.
// //     if(Card.kind.CLOVER == Card.Value.TWO) // 컴파일에러. 타입이 달라서 비교 불가.
// // }

// // enum 열거형이름 { 상수명1, 상수명2, ... }

// // static E[] values()
// // static E valueOf(String name)

// // Direction[] dArr = Direction.values();

// // for(Direction d : DArr){
// //     System.out.println("%s=%d%n", d.name(), d.ordinal());
// // }

// enum Direction {
//     EAST(1), SOUTH(5), WEST(-1), NORTH(10);

//     private final int value;

//     Direction(int value) {
//         this.value = value;
//     }

//     public int getValue() {
//         return value;
//     }
// };

// Direction d = new Direction(1);