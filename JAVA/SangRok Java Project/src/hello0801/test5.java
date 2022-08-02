package hello0801;

public class test5 {

    public static void main(String[] args) {
        String[] list = new String[] {"muzi", "frodo", "apeach", "neo"};
        String[] list2 = new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        

        System.out.println(solution(list, list2, 2).toString());
    }

    
    public static int[] solution (String[] id_list, String[] report, int k) {  //이용자 ID, 각 이용자가 신고한 ID, 정지 기준이되는 신고 횟수
        
        int[] uIndex = new int[id_list.length];
        int[] answer = new int[id_list.length];  //각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담는다.
        
        // k번 이상 신고당한 유저를 추출.
        for(int i = 0; i < id_list.length; i++){
            for(int j = 0; j < report.length; j++){
                if(report[j].contains(" ".concat(id_list[i]))){
                    uIndex[i] ++;
                }
            }
        }
        
        String[] userArr = new String[2];
        
        for(int i = 0; i < uIndex.length; i++){
            if(uIndex[i] == k){     // k번 이상 신고되었는가?
                for(int j = 0; j < report.length; j++){     // 리포트의 길이만큼 검사
                    if(report[j].contains(" ".concat(id_list[i]))){     // 리포트에 신고당한 사람이 있는가?
                        userArr = report[j].split(" ");     // 리포트의 신고자와 신고당한 사람을 split().

                        for(int h = 0; h < id_list.length; h++){
                            if(id_list[h].contains(userArr[0])){    // 아이디 리스트에서 신고한 사람을 검사.
                                answer[h]++;    // 맞으면 해당 인덱스에 1을 더한다.
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
        return answer;
    }

}
