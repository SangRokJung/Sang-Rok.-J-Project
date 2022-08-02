package hello0801;

public class test {
    public static void main(String[] args) {
        String s = "1111";
        String s1 = "";

        int[] a = new int[4];

        String[] sArr = {"1", "2", "3", "4", "5"};

        String[] sArr2 = new String[5];

        for(int i = 0; i < 5; i++){
            sArr2[i] += sArr[i];
            s1 = " ".concat(s);
        }

        System.out.println(s1);

        a[1]++;

        String smple = "12345";

        String[] user = new String[2];
        // user[2] = smple;
        user[0] = "hellop";

        user = smple.split("");

        System.out.println(user[0]);
    }
}
