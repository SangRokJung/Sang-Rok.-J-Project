package hello0729;

import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList  = new ArrayList<Product>();
        ArrayList<Tv> tvList            = new ArrayList<Tv>();
        // ArrayList<Product> tvList    = new ArrayList<Tv>(); // ERROR.
        List<Tv> TvList2                = new ArrayList<Tv>(); // OK. 다형성

        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        // tvList.add(new Audio());    // Error.

        printAll(productList);
        // printAll(tvList);   // Error. 컴파일 에러.
        // 참조변수와 생성자 타입이 같아야된다
    }
    
    public static void printAll(ArrayList<Product> list){   
                    
        for(Product p : list){
            System.out.println(p);
        }
    }
}
