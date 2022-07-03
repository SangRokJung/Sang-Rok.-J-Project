package hello0622;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 1.2, 1.3, 1.4, 1.5};

        // arOrg와 동일한 배열을 만든다.
        double[] arCpy = Arrays.copyOf(arOrg, arOrg.length);



        // arOrg의 일부분을 배열로 만든다. (index '1'부터 '3'전 까지)
        double[] arPart = Arrays.copyOfRange(arOrg, 1, 3);

        arCpy[0] = 0;
        for(double dd : arCpy) {
            System.out.println(dd);
        }
        System.out.println("--------------------------------------");



        // 이미 할당된 배열이 있고 값만 카피한다.
        double[] arr = new double[3];
        System.arraycopy(arOrg, 1, arr, 0, 3);

        for (double d : arr){
            System.out.println(d);
        }



        // 배열의 비교
        if (true == Arrays.equals(arOrg, arCpy)){
            System.out.println("true");
        }



        // 배열의 정렬
        int[] ar1 = {42, 4, 24, 7, 1, 0};

        Arrays.sort(ar1);

        for (int a : ar1){
            System.out.println(a);
        }



        // 특정 Object의 배열을 정렬.
        // Coparealbe Interface를 구현 => compareTo()함수를 구현
        person[] arPerson = new person[4];

        arPerson[0] = new person("aaa", 10);
        arPerson[1] = new person("bbb", 320);
        arPerson[2] = new person("ccc", 42);
        arPerson[3] = new person("ddd", 22);

        Arrays.sort(arPerson);

        for(person p : arPerson){
            System.out.println(p);
        }


        // 특정 위치의 인덱스를 찾는다.
        int idx = Arrays.binarySearch(arPerson, new person("aaa", 10));
        System.out.println(idx);
    }
}
