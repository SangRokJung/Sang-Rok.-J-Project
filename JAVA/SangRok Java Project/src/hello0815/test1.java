package hello0815;

public class test1 {
    public static String solution(String new_id) {
        String answer = "";
        String[] strArr = new String[]{"~", "!", "@", "#", "$", "%", "\\^", "&", "[*]", "\\(", "\\)", "=", "[+]", "\\[", "\\{", "\\]", "\\}", ":", "[?]", ",", "<", ">", "/"};
        
        // 1.
        String s1 = new_id.toLowerCase();
        
        
        // 2.
        s1 = s1.replaceAll("[~!@#$%^&*()=+[{]}:?,<>/]", "");
        

        // 3.
        s1 = s1.replaceAll(".+", ".");

        StringBuffer sbf1 = new StringBuffer(s1);

        while(s1.contains("..")){

            for(int i  = 0; i < s1.length(); i++) {
            
                if(s1.charAt(i) == '.'){
    
                    if(s1.charAt(i+1) == '.'){
                        sbf1.deleteCharAt(i+1);
                        s1 = sbf1.toString();
                    }
                }
            }
        }


        
        // 4.
        s1.replaceAll(".$", ".");
        s1.replaceAll(".^", ".");

        sbf1 = new StringBuffer(s1);
    
        
        if(sbf1.indexOf(".") == 0){
            sbf1.deleteCharAt(0);
        }
        s1 = sbf1.toString();
        
        if(s1.endsWith(".")){
            sbf1.deleteCharAt(sbf1.length() -1);
        }
                
        
        // 5.
        if(sbf1.length() == 0){
            sbf1.append("a");
        }
        
        
        // 6.
        if(sbf1.length() >= 16){
            sbf1.delete(15, sbf1.length() - 1);
                
                s1 = sbf1.toString();
                if(s1.endsWith(".")){
                    sbf1.deleteCharAt(s1.length() -1);
                }
        }
        
        
        // 7.
        if(sbf1.length() <= 2){
            
            while(sbf1.length() == 3){
                sbf1.append(sbf1.charAt(sbf1.length() - 1));
            }
        }
        
        answer = sbf1.toString();
        return answer;
    }


    public static void main(String[] args) {
        String id2 = "z-+.^.";
        String id1 = "...!@BaT#*..y.abc...defghi..jklm";
        System.out.println(solution(id1)); 
    }
}
