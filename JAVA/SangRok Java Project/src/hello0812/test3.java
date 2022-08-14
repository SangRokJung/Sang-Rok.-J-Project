package hello0812;

public class test3 {
    public static String solution(String new_id) {
        String answer = "";
        String[] strArr = new String[]{"~", "!", "@", "#", "$", "%", "^", "&", "[*]", "\\(", "\\)", "=", "[+]", "\\[", "\\{", "\\]", "\\}", ":", "[?]", ",", "<", ">", "/"};
        
        // 1.
        String s1 = new_id.toLowerCase();
        
        
        // 2.
        for(String str : strArr){
            s1 =  s1.replaceAll(str, "");
            
        }
        

        // 3.
        while(s1.contains("..")){

            for(int i  = 0; i < s1.length(); i++) {
            
                if(s1.charAt(i) == '.'){
    
                    if(s1.charAt(i+1) == '.'){
    
                    }
                }
            }
        }



        s1 = s1.replace("...", ".");
        s1 = s1.replace("..", ".");
        
        
        // 4.
        StringBuffer sbf1 = new StringBuffer(s1);
    
        
        if(sbf1.indexOf(".") == 0){
            sbf1.deleteCharAt(0);
        }
        s1 = sbf1.toString();
        
        if(s1.endsWith(".")){
            sbf1.deleteCharAt(s1.length() -1);
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
        solution("...!@BaT#*..y.abc...defghi..jklm");
    }
}
