package hello0622;

public class Ex9 {
    public static void main(String[] args) {

        //String Instance 생성
        String s = new String("hello");
        System.out.println(s);
        //hello



        //주어진 문자열을 가지고 있는 String Instance생성
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        String s1 = new String(c);
        System.out.println(s1);
        //hello




        //StringBuffer Instance가 가지고 있는 문자열과 같은 내용의 String Instance를 생성
        StringBuffer sb = new StringBuffer("hello");
        String s2 = new String(sb);
        System.out.println(s2);
        //hello




        //지정한 인덱스의 문자 추출
        String s3 = "hello";
        String s4 = "012345";
        char c2 = s3.charAt(1);
        char c3 = s4.charAt(3);
        System.out.println("c2 : " + c2 + " / c3 : " + c3);
        //c2 : e / c3 : 3



        //사전순서로 비교
        int i = "aaa".compareTo("aaa");
        int i2 = "bbb".compareTo("ccc");
        int i3 = "ccc".compareTo("ddd");
        System.out.println("i : " + i + " / i2 : " + i2 + " / i3 : " + i3);
        //i : 0 / i2 : -1 / i3 : -1





        //문자열 덧붙이기.
        String s5 = "hello";
        String s6 = s5.concat("MMMMMM~");
        System.out.println(s6);
        //helloMMMMMM~





        //지정된 문자열 포함 유무 확인
        String s7 = "hello";
        boolean b = s7.contains("a");
        System.out.println(b);
        //false




        //지정된 문자열로 끝나는지 검사
        String file = "hello.txt";
        boolean b2 = file.endsWith(".txt");
        System.out.println(b2);
        //true





        //매개변수로 받은 문자열과 String instance 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false 반환.
        String s8 = "hello";
        boolean b3 = s8.equals("hello");
        boolean b4 = s8.equals("Hello");
        System.out.println("b3 : " + b3 + " / b4 : " + b4);
        //b3 : true / b4 : false





        //문자열과 String instance의 문자열을 대소문자 구분없이 비교한다.
        String s9 = "hello";
        boolean b5 = s9.equalsIgnoreCase("heLLo");
        boolean b6 = s9.equalsIgnoreCase("HELLO");
        System.out.println("b5 : " + b5 + " / b6 : " + b6);
        //b5 : true / b6 : true



        //주어진 문자가 문자열에 준재하는지 확인하며
        //index를 알려준다. 없다면 -1을 반환.
        String s10 = "hello";
        int idx = s10.indexOf('e');
        int idx2 = s10.indexOf("l");
        System.out.println("idx : " + idx + " / idx2 : " + idx2);
        //idx : 1 / idx2 : 2




        //주어진 문자가 문자열에 존재하는지 지정된 위치 부터 확인하여
        //index를 반환하고 찾지 못하면 -1을 반환한다.
        String s11 = "hello";
        int idx3 = s11.indexOf("3", 3);
        int idx4 = s11.indexOf("h", 4);
        System.out.println("idx3 : " + idx3 + " / idx4 : " + idx4);
        //idx3 : -1 / idx4 : -1
        




        //주어진 문자열이 존재하는지 확인하고 index를 출력하고 없으면 -1을 반환.
        String s12 = "ABCDEFG";
        int idx5 = s12.indexOf("DE");
        System.out.println("idx5 : " + idx5);
        //idx5 : 3






        //문자열을 상수풀에 등록한다.
        //이미 상수풀에 같은 내용의 문자열이 있을경우
        //그 문자열의 주소값을 반환한다.
        String s13 = new String("abc");
        String s14 = new String("abc");
        boolean b7 = s13.equals(s14);
        boolean b8 = (s13 == s14);
        boolean b9 = (s13.intern() == s14.intern());
        System.out.println("b7 : " + b7 + " / b8 : " + b8 + " / b9 : " + b9);
        //b7 : true / b8 : false / b9 : true





        //지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서 부터 찾아서 index를 출력한다.
        //못찾으면 -1 반환
        String s15 = "java.Is.VeryGood";
        int idx6 = s15.lastIndexOf('.');
        int idx7 = s15.indexOf('.');
        System.out.println("idx6 : " + idx6 + " / idx7 : " + idx7);
        //idx6 : 7 / idx7 : 4





        //지정된 문자열을 Instance 문자열 끝에서 부터 찾아 index를 출력, 못찾으면 -1 반환.
        String s16 = "java.lang.util";
        int idx8 = s16.lastIndexOf("java");
        int idx9 = s16.lastIndexOf("lang");
        System.out.println("idx8 : " + idx8 + " / idx9 : " + idx9);
        //idx8 : 0 / idx9 : 5






        //문자열의 길이 출력
        String s17 = "hi every body";
        int length = s17.length();
        System.out.println("s17.length : " + length);
        //s17.length : 13





        //문자열 중의 문자(열)을 새로운 문자(열)로 모두 바꾼 문자열로 반환.
        String s18 = "HelloHi";
        String s19 = s18.replace("H", "A");
        System.out.println("s19 : " + s19);
        //s19 : AelloAi

        String s20 = "AAABBBCCCDDD";
        String s21 = s20.replace("AAA", "aaa");
        System.out.println("s21 : " + s21);
        //s21 : aaaBBBCCCDDD






        //문자열 중에서 지정된 문자열과 일치하는 것으 ㄹ새로운 문자열로 모두 변경.
        String s22 = "AAAABBBBAAAA";
        String s23 = s22.replaceAll("AAAA", "aaaa");
        System.out.println("s23 : " + s23);
        //s23 : aaaaBBBBaaaa






        //문자열 중 지정된 문자열과 일치하는것 중 첫번째 것만 새로운 문자열로 변경.
        String s24 = "AAABBBAAABBB";
        String s25 = s24.replaceFirst("AAA", "aaa");
        System.out.println("s25 : "+ s25);
        //s25 : aaaBBBAAABBB




        //문자열을 지정된 regex로 나누어 문자열 배열에 담아 반환한다.
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        for(int j = 0; j < arr.length; j++){
            System.out.println("arr : " + arr[j]);
        }
        //arr : dog
        //arr : cat
        //arr : bear
        



        //문자열을 지정된 regex로 나누어 문자열배열에 담아 반환한다.
        //단 문자열 저넻를 지정된 limit으로 자른다.
        String animals2 = "dog,cat,bear,monkey";
        String[] arr2 = animals2.split(",", 2);
        for(int j = 0; j < arr2.length; j++){
            System.out.println("arr2 : " + arr2[j]);
        }
        //arr2 : dog
        //arr2 : cat,bear,monkey




        //주어진 문자열로 시작하는지 검사.
        String s26 = "java.lang.Object";
        boolean b10 = s26.startsWith("java");
        boolean b11 = s26.startsWith("lang");
        System.out.println("b10 : " + b10 + " / b11 : " + b11);
        //b10 : true / b11 : false





        //주어진 시작위치 부터 끝 위치 까지 범위에 포함된 문자열을 추출한다.
        //시작위치는 문자 범위에 포함되지만 끝 위치의 문자는 포함되지 않는다.
        String s27 = "java.lang.Object";
        String s28 = s27.substring(10);
        String s29 = s27.substring(5, 9);
        System.out.println("s28 : " + s28 + " / s29 : " + s29);
        //s28 : Object / s29 : lang




        //String Instance에 저장되어있는 모든 문자열을 소문자로 반환하여 반환한다.
        String s30 = "HELLO";
        String s31 = s30.toLowerCase();
        System.out.println(s31);
        //hello




        //String Instanced에 저장되어있는 모든 문자열을 반환.
        String s32 = "STRING!!";
        String s33 = s32.toString();
        System.out.println(s33);
        //STRING!!





        //String Instance에 저장되어있는 모든 문자열을 대문자로 반환
        String s34 = "Hi My Name is umm..";
        String s35 = s34.toUpperCase();
        System.out.println(s35);
        //HI MY NAME IS UMM..





        //문자열에 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다.
        //이때 문자열 중간에 있는 공백은 제거 되지 않는다.
        String s36 = "        Empty haha      ";
        String s37 = s36.trim();
        System.out.println(s37);
        //Empty haha




        //지정된 값을 문자열로 변환하여 반환한다.
        //참조 변수의 경우 toString()을 호출한 결과를 반환한다.
        String bo = String.valueOf(true);
        String ch = String.valueOf('c');
        String in = String.valueOf(100);
        String l = String.valueOf(100L);
        String f = String.valueOf(10f);
        String d = String.valueOf(10.0);
        java.util.Date dd = new java.util.Date();
        String date = String.valueOf(dd);

        System.out.println("bo: " + bo + " / ch: " + ch + " / in: " + in + "/ l : " + l + "/ f : " + f + " / d : " + d + " / date : " + date);
        //bo: true / ch: c / in: 100/ l : 100/ f : 10.0 / d : 10.0 / date : Wed Jun 22 17:49:15 KST 2022
    }
}
