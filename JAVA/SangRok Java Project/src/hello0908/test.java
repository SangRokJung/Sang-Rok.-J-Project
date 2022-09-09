package hello0908;
import java.util.*;
public class test {
    public static int  solution(String dartResult) {
        int answer = 0;
        int result = 0;
        LinkedList<String> list = new LinkedList<>();
        String[] strList = dartResult.split("");

        // 10T*10S*10D*

        // 셋트당 점수 변수
        int firstScore = 0;
        int secondScore = 0;
        int thirdScroe = 0;

        // 숫보옵숫보옵숫보옵

        boolean isTen = false;
        if(dartResult.contains("10")){
            isTen = true;
        }

        if(isTen == true){
            // 7 ~ 12
            if(dartResult.length() == 7){
                if(dartResult.indexOf("10") == 0){
                    firstScore = 10;
                }
            }
            if(dartResult.length() == 8){

            }
            if(dartResult.length() == 9){

            }
            if(dartResult.length() == 10){

            }
            if(dartResult.length() == 11){

            }
            if(dartResult.length() == 12){

            }

        }else{
            for(int i = 0; i < strList.length; i++){
                list.add(strList[i]);
            }
        }

        // list에 추가


        // 10으로 들어오는 경우
        // 10D2D3D
        // 1D2D10D
        // 1D*2D*10D




        // 1세트 점수 설정 (10 여부 확인)

        if(dartResult.indexOf("10") == 0){
            firstScore = 10;
        } else {
            firstScore = Integer.parseInt(list.get(0));
        }
        
        if(list.get(1).equals("D")){
            Math.pow(firstScore, 2);
        }
        else if(list.get(1).equals("T")){
            Math.pow(firstScore, 3);
        }

        if(list.get(2).equals("#")){
            firstScore *= (-1);
        }
        else if(list.get(2).equals("*")){
            firstScore *= 2;
        }
        
        // 6으로 들어올경우
        // 1D2D3T
        // 012345
        if(list.size() == 6){
            secondScore = Integer.parseInt(list.get(2));
            thirdScroe = Integer.parseInt(list.get(4));
            

            // 2셋 점수
            if(list.get(3).equals("D")){
                secondScore = (int) Math.pow(secondScore, 2);
            }
            else if(list.get(3).equals("T")){
                secondScore = (int) Math.pow(secondScore, 3);
            }



            if(list.get(5).equals("D")){
                thirdScroe = (int) Math.pow(thirdScroe, 2);
            }
            else if(list.get(5).equals("T")){
                thirdScroe = (int) Math.pow(thirdScroe, 3);
            }

            result = firstScore + secondScore + thirdScroe;
        }
        // 1D*2D10D
        // 1D*10D3D
        
        else if(list.size() == 7){

            if(isTen == true){
                if(dartResult.indexOf("10") == 2){
                    secondScore = 10;
                }
                if(dartResult.indexOf("10") == 4){
                    secondScore = 10;
                }
            }
            else{
                secondScore = Integer.parseInt(list.get(2));
                thirdScroe = Integer.parseInt(list.get(4));
            }

            // 0123456
            // 1D2D*3D
            if(list.get(4).equals("#") || list.get(4).equals("*")){
                secondScore = Integer.parseInt(list.get(2));
                thirdScroe = Integer.parseInt(list.get(5));


                if(list.get(3).equals("D")){
                    secondScore = (int) Math.pow(secondScore, 2);
                }
                else if(list.get(3).equals("T")){
                    secondScore = (int) Math.pow(secondScore, 3);
                }

                if(list.get(4).equals("#")){
                    secondScore *= (-1);
                }
                else if(list.get(4).equals("*")){
                    firstScore *= 2;
                    secondScore *= 2;
                }

                if(list.get(6).equals("D")){
                    thirdScroe = (int) Math.pow(thirdScroe, 2);
                }
                else if(list.get(6).equals("T")){
                    thirdScroe = (int) Math.pow(thirdScroe, 3);
                }
                result = firstScore + secondScore + thirdScroe;
            }
            // 0123456
            // 1D2D3D*
            else if(list.get(6).equals("#") || list.get(6).equals("*")){
                secondScore = Integer.parseInt(list.get(2));
                thirdScroe = Integer.parseInt(list.get(4));

                if(list.get(3).equals("D")){
                    secondScore = (int) Math.pow(secondScore, 2);
                }
                else if(list.get(3).equals("T")){
                    secondScore = (int) Math.pow(secondScore, 3);
                }

                if(list.get(5).equals("D")){
                    thirdScroe = (int) Math.pow(thirdScroe, 2);
                }
                else if(list.get(5).equals("T")){
                    thirdScroe = (int) Math.pow(thirdScroe, 3);
                }

                if(list.get(6).equals("#")){
                    thirdScroe *= (-1);
                }
                else if(list.get(6).equals("*")){
                    secondScore *= 2;
                    thirdScroe *= 2;
                }

                result = firstScore + secondScore + thirdScroe;
            }
        }
        else if (list.size() == 8){

            // 01234567
            // 1D*2D*3D
            // 1D2D*3D*
            System.out.println(list.get(2));
            System.out.println(list.get(5));
            if((list.get(2).equals("*") || list.get(5).equals("*")) || (list.get(2).equals("*") || list.get(5).equals("#")) || 
                (list.get(2).equals("#") || list.get(5).equals("*")) || (list.get(2).equals("#") || list.get(5).equals("#"))){

                secondScore = Integer.parseInt(list.get(3));
                thirdScroe = Integer.parseInt(list.get(6));


                if(list.get(4).equals("D")){
                    secondScore = (int) Math.pow(secondScore, 2);
                }
                else if(list.get(4).equals("T")){
                    secondScore = (int) Math.pow(secondScore, 3);
                }

                if(list.get(6).equals("D")){
                    thirdScroe = (int) Math.pow(thirdScroe, 2);
                }
                else if(list.get(6).equals("T")){
                    thirdScroe = (int) Math.pow(thirdScroe, 3);
                }

                if(list.get(5).equals("*")){
                    firstScore *= 2;
                    secondScore *= 2;
                }
                else if(list.get(5).equals("#")){
                    secondScore *= (-1);
                }
                result = firstScore + secondScore + thirdScroe;
            }
            // 01234567
            // 1D2D*3D*
            // 1D2D*3D#
            else if((list.get(4).equals("*") || list.get(7).equals("*")) || (list.get(4).equals("*") || list.get(7).equals("#")) || 
                    (list.get(4).equals("#") || list.get(7).equals("*")) || (list.get(4).equals("#") || list.get(7).equals("#"))){
                        secondScore = Integer.parseInt(list.get(2));
                        thirdScroe = Integer.parseInt(list.get(5));


                        if(list.get(3).equals("D")){
                            secondScore = (int) Math.pow(secondScore, 2);
                        }
                        else if(list.get(3).equals("T")){
                            secondScore = (int) Math.pow(secondScore, 3);
                        }
        
                        if(list.get(6).equals("D")){
                            thirdScroe = (int) Math.pow(thirdScroe, 2);
                        }
                        else if(list.get(6).equals("T")){
                            thirdScroe = (int) Math.pow(thirdScroe, 3);
                        }

                        if(list.get(4).equals("*")){
                            firstScore *= 2;
                            secondScore *= 2;
                        }
                        else if(list.get(4).equals("#")){
                            secondScore *= (-1);
                        }

                        if(list.get(6).equals("*")){
                            secondScore *= 2;
                            thirdScroe *= 2;
                        }
                        else if(list.get(6).equals("#")){
                            thirdScroe *= (-1);
                        }
                        result = firstScore + secondScore + thirdScroe;
            }
        }
        // 012345678
        // 1D*2D*3D*
        else if (list.size() == 9){
            secondScore = Integer.parseInt(list.get(3));
            thirdScroe = Integer.parseInt(list.get(6));


            // 2셋 점수
            if(list.get(4).equals("D")){
                secondScore = (int) Math.pow(secondScore, 2);
            }
            else if(list.get(4).equals("T")){
                secondScore = (int) Math.pow(secondScore, 3);
            }

            // 3셋 점수
            if(list.get(7).equals("D")){
                secondScore = (int) Math.pow(secondScore, 2);
            }
            else if(list.get(7).equals("T")){
                secondScore = (int) Math.pow(secondScore, 3);
            }

            // 012345678
            // 1D*2D*3D*
            // option
            firstScore *= 2;

            if(list.get(5).equals("*")){
                firstScore *= 2;
                secondScore *= 2;
            }
            else if(list.get(5).equals("#")){
                secondScore *= (-1);
            }

            if(list.get(8).equals("*")){
                secondScore *= 2;
                thirdScroe *= 2;
            }
            else if(list.get(8).equals("#")){
                thirdScroe *= (-1);
            }
            result = firstScore + secondScore + thirdScroe;
        }
        answer = result;
        return answer;
    }
    public static void main(String[] args) {
        String str = "1D2S#10S";
        System.out.println(solution(str));
    }
}



