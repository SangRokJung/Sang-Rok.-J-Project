package hello0609;

interface inter{
    public void meth();
}

public class it implements inter{
    
    public void meth(){
        System.out.println("");
    }

    public static void main(String[] args) {
        inter it = new it();

        it.meth();
    }
}
