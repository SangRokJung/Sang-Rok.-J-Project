package hello0816;

public class test1 {
    public static String solution(String new_id) {
        String s1 = "";
        
        // 1. new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        s1 = new_id.toLowerCase();
        
        // 2. new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        s1 = s1.replaceAll("[^-_.a-z0-9]", "");
        
        // 3. new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        s1 = s1.replaceAll("[.]+", ".");

        // 4. new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        s1 = s1.replaceAll("^[.]|[.]$", "");

        // 5. new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(s1.isEmpty()){
            s1 += "a";
        }
        
        // 6. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(s1.length() >= 16){
            s1 = s1.substring(0, 15);
            s1 = s1.replaceAll("[.]$", "");
        }
        
        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        // s1 = minString(s1);
        if(s1.length() <= 2){
            String sS = Character.toString(s1.charAt(s1.length()-1));
            while(s1.length() < 3){
                s1 += sS;
            }
        }
        
        return s1;
    }


    public static void main(String[] args) {
        String id2 = "z-+.^.";
        String id1 = "...!@BaT#*..y.abc...defghi..jklm.";
        String id3 = "abcdefghijklmn.p";
        String id4 = "=.=";
        System.out.println(solution(id4)); 
    }
}
