package hello0629;

public class WrapperSmp {
    public static void main(String[] args) {
        Boolean b = new Boolean(true);
        Boolean b2 = new Boolean("true");

        Character c = new Character('a');

        Byte b3 = new Byte((byte) 7);
        Byte b4 = new Byte("10");

        Short s = new Short((short) 10);
        Short s1 = new Short("10");

        Integer i = new Integer(10);
        Integer i2= new Integer("10");

        Long l = new Long(100);
        Long l2 = new Long("100");

        Float f = new Float(1.0);
        Float f2 = new Float(2.0f);
        Float f3 = new Float("1.0f");

        Double d= new Double(1.0);
        Double d2 = new Double("2.0");
    }
}
