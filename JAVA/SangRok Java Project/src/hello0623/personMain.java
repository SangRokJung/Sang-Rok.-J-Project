package hello0623;

import java.util.Arrays;

public class personMain {
    public static void main(String[] args) {
        person[] p = new person[10];
        
        p[0] = new person("aaa", 25);
        p[1] = new person("bbb", 22);
        p[2] = new person("ccc", 28);
        p[3] = new person("ddd", 24);
        p[4] = new person("fff", 12);
        p[5] = new person("eee", 87);
        p[6] = new person("ggg", 32);
        p[7] = new person("hhh", 78);
        p[8] = new person("iii", 32);
        p[9] = new person("jjj", 11);



        Arrays.sort(p);
        for(person ppp : p){
            System.out.println(ppp);
        }


        int idx = Arrays.binarySearch(p, new person("hhh", 78));
        System.out.println(idx);
    }
}
