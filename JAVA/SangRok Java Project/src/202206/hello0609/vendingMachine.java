package hello0609;

interface orderable{
    public boolean putMoney(int money);
}

public class vendingMachine implements orderable{

    public boolean putMoney(int money){
        return true;
    }

    public static void main(String[] args) {

        //제공하는 Interface만 사용하겠다.
        orderable v  = new vendingMachine();

        v.putMoney(100);
    }
}
