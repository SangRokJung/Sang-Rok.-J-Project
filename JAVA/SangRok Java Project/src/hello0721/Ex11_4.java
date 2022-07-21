package hello0721;

import java.util.*;

public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true){
            System.out.print(">>");
            try{
                // 화면으로부터 라인단위로 입력받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); //trim() : 양쪽 끝의 공백 제거

                if("".equals(input))
                    continue;

                if(input.equalsIgnoreCase("q")) // equalsIgnoreCase() : 문자열을 대소문자 상관없이 비교 
                    System.exit(0);

                else if(input.equalsIgnoreCase("help")){
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                }
                else if(input.equalsIgnoreCase("history")){
                    save(input); //입력받은 명령어를 저장

                    // LinkedList의 내용을 보여준다.
                    LinkedList list = (LinkedList)q;

                    final int SIZE = list.size();

                    for(int i = 0; i < SIZE; i++){
                        System.out.println((i+1) + "." + list.get(i));
                    }
                }
                else{
                    save(input); 
                    System.out.println(input);
                }
            }
            catch(Exception e){
                System.out.println("입력오류입니다.");
            }
        }
    }

    public static void save(String input){
        // queue에 저장한다.
        if(!"".equals(input)){
            q.offer(input);     // Queue에 객체를 저장
        }
        if(q.size() > MAX_SIZE){
            q.remove();         // Queue에 객체를 꺼내 반환.
        }
    }
}
