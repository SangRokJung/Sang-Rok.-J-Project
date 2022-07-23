package hello0723;

import java.util.*;

public class arraysmethod {
    public static void main(String[] args) {
        // 배열의 출력
        // static String toString(boolean[] a)
        // static String toString(byte[] a)
        // static String toString(char[] a)
        // static String toString(short[] a)
        // static String toString(int[] a)
        // static String toString(long[] a)
        // static String toString(float[] a)
        // static String toString(double[] a)
        // static String toString(Object[] a) 

        // 배열의 복사
        // copyOf(), copyOfRange()
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);            //arr2 = [0, 1, 2, 3, 4]
        int[] arr3 = Arrays.copyOf(arr, 3);          //arr3 = [0, 1, 2]
        int[] arr4 = Arrays.copyOf(arr, 7);          //arr4 = [0, 1, 2, 3, 4, 0, 0]
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);   //arr5 = [2, 3] <= 4는 불포함
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);   //arr6 = [0, 1, 2, 3, 4, 0, 0]


        // 배열 채우기
        // fill(), setAll()
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9); // arr = [9, 9, 9, 9, 9]
        Arrays.setAll(arr7, (i) -> (int)(Math.random() * 5) + 1); // arr = [1이상 6이하의 난수]


        // 배열의 정렬과 검색
        // sort(), birnarySearch()
        int[] arr8 = {3, 2, 0, 1, 4};
        Arrays.sort(arr8); // binarySearch를 하기 위해서는 정렬을 해야한다. (이진 검색)
        int idx = Arrays.binarySearch(arr8, 2);


        // 다차원 배열의 출력
        // deepToString()
        int[][] arr2D = {{11, 22}, {21, 22}}; // [[11, 12], [21, 22]]



        // 다차원 배열의 비교
        // deepEquals()
        String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        Arrays.deepEquals(str2D, str2D2); // true


        // 배열을 list로 반환
        // asList(Object... a) 가변 매개변수 (가변 : 개수가 정해져 있지 않음.)
        List list1 = Arrays.asList(new Integer[] {1, 2, 3, 4, 5});
        List list2 = Arrays.asList(1, 2, 3, 4, 5);
        //list.add(6); // UnsupportedOperrationException 예외 발생 (List는 읽기 전용임)

        List list3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));

    }
}
