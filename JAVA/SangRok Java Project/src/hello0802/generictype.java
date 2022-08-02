package hello0802;

// public class generictype {
//     Box box = null;
//     Box<Object> objBox = null;

//     box = (Box)objBox;          //OK. 지네릭 타입   => 원시 타입, 경고 발생
//     objBox = (Box<Object>box);  //OK. 원시 타입     => 지네릭 타입, 경고 발생
    

//     Box<Object> objBox = null;
//     Box<String> strBox = null;

//     objBox = (Box<Object>strBox);   //에러. Box<String> => Box<Object>
//     strBox = (Box<String>objBox);   //에러. Box<Object> => Box<String>


//     Box<Object> objBox = (Box<Object>)new Box<String>();    //에러. 형변환 불가능
//     Box<? extends Object> wBox = (Box<? extends Object>)new Box<String>(); //OK.
//     Box<? extends Object> wBox = new Box<String>(); //위 문장과 동일.

//     static Juice makeJuice(FruitBox<? extends Fruit> box) {}
//     FruitBox<? extends Fruit> box = new FruitBox<Fruit>(); //OK
//     FruitBox<? extends Fruit> box = new FruitBox<Fruit>(); //OK

// }
