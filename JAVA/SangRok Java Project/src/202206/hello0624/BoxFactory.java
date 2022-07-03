package hello0624;

public class BoxFactory {
    
    // <T>를 ReturnType 앞에 붙인다.
    public static <T> box<T> makeEmptyBox(){
        box<T> box = new box<T>();
        return box;
    }

    public static <T> box<T> makeBox(T obj){
        box<T> box = new box<T>(obj);
        return box;
    }
}
