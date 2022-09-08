package hello0908;
import java.util.*;
public class test {
    public int solution(String dartResult) {
        int answer = 0;
        int result = 0;
        LinkedList<String> list = new LinkedList<>();
        String[] strList = dartResult.split("");
        
        for(int i = 0; i < strList.length; i++){
            list.add(strList[i]);
        }
        
        int firstScore = Integer.parseInt(list.get(0));
        
        // 6~9

        if(list.size() == 6){
            int secondScore = Integer.parseInt(list.get(2));
            int thirdScroe = Integer.parseInt(list.get(4));

            // 1D2D3T
            // 1셋 점수
            if(list.get(1) == "D"){
                Math.pow(firstScore, 2);
            }
            else if(list.get(1) == "T"){
                Math.pow(firstScore, 3);
            }

            // 2셋 점수
            if(list.get(3) == "D"){
                Math.pow(secondScore, 2);
            }
            else if(list.get(3) == "T"){
                Math.pow(secondScore, 3);
            }

            if(list.get(2) == "#"){
                firstScore *= (-1);
                secondScore = Integer.parseInt(list.get(3));
                thirdScroe = Integer.parseInt(list.get(5));
            }
            else if(list.get(2) == "*"){
                firstScore *= 2;
                secondScore = Integer.parseInt(list.get(3));
                thirdScroe = Integer.parseInt(list.get(5));
            }

            if(list.get(5) == "D"){
                Math.pow(thirdScroe, 2);
            }
            else if(list.get(5) == "T"){
                Math.pow(thirdScroe, 3);
            }

            result = firstScore + secondScore + thirdScroe;
        }
        else if(list.size() == 7){

            // 0123456
            // 1D2D*3D
            if(list.get(4) == "#" || list.get(4) == "*"){
                int secondScore = Integer.parseInt(list.get(2));
                int thirdScroe = Integer.parseInt(list.get(5));


                if(list.get(3) == "D"){
                    Math.pow(secondScore, 2);
                }
                else if(list.get(3) == "T"){
                    Math.pow(secondScore, 3);
                }

                if(list.get(4) == "#"){
                    secondScore *= (-1);
                }
                else if(list.get(4) == "*"){
                    firstScore *= 2;
                    secondScore *= 2;
                }
                result = firstScore + secondScore + thirdScroe;
            }
            // 0123456
            // 1D2D3D*
            else if(list.get(6) == "#" || list.get(6) == "*"){
                int secondScore = Integer.parseInt(list.get(2));
                int thirdScroe = Integer.parseInt(list.get(4));

                if(list.get(5) == "D"){
                    Math.pow(thirdScroe, 2);
                }
                else if(list.get(5) == "T"){
                    Math.pow(thirdScroe, 3);
                }

                if(list.get(6) == "#"){
                    thirdScroe *= (-1);
                }
                else if(list.get(6) == "*"){
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
            if((list.get(2) == "*" || list.get(5) == "*") && (list.get(2) == "*" || list.get(5) == "#") && 
                (list.get(2) == "#" || list.get(5) == "*") && (list.get(2) == "#" || list.get(5) == "#")){

                int secondScore = Integer.parseInt(list.get(3));
                int thirdScroe = Integer.parseInt(list.get(6));


                if(list.get(4) == "D"){
                    Math.pow(secondScore, 2);
                }
                else if(list.get(4) == "T"){
                    Math.pow(secondScore, 3);
                }

                if(list.get(6) == "D"){
                    Math.pow(thirdScroe, 2);
                }
                else if(list.get(6) == "T"){
                    Math.pow(thirdScroe, 3);
                }

                if(list.get(5) == "*"){
                    firstScore *= 2;
                    secondScore *= 2;
                }
                else if(list.get(5) == "#"){
                    secondScore *= (-1);
                }
                result = firstScore + secondScore + thirdScroe;
            }
            // 01234567
            // 1D2D*3D*
            // 1D2D*3D#
            else if((list.get(4) == "*" || list.get(7) == "*") && (list.get(4) == "*" || list.get(7) == "#") && 
                    (list.get(4) == "#" || list.get(7) == "*") && (list.get(4) == "#" || list.get(7) == "#")){
                        int secondScore = Integer.parseInt(list.get(2));
                        int thirdScroe = Integer.parseInt(list.get(5));


                        if(list.get(3) == "D"){
                            Math.pow(secondScore, 2);
                        }
                        else if(list.get(3) == "T"){
                            Math.pow(secondScore, 3);
                        }
        
                        if(list.get(6) == "D"){
                            Math.pow(thirdScroe, 2);
                        }
                        else if(list.get(6) == "T"){
                            Math.pow(thirdScroe, 3);
                        }

                        if(list.get(4) == "*"){
                            firstScore *= 2;
                            secondScore *= 2;
                        }
                        else if(list.get(4) == "#"){
                            secondScore *= (-1);
                        }

                        if(list.get(6) == "*"){
                            secondScore *= 2;
                            thirdScroe *= 2;
                        }
                        else if(list.get(6) == "#"){
                            thirdScroe *= (-1);
                        }
                        result = firstScore + secondScore + thirdScroe;
            }
        }
        // 012345678
        // 1D*2D*3D*
        else if (list.size() == 9){
            int secondScore = Integer.parseInt(list.get(3));
            int thirdScroe = Integer.parseInt(list.get(6));


            // 2셋 점수
            if(list.get(4) == "D"){
                Math.pow(secondScore, 2);
            }
            else if(list.get(4) == "T"){
                Math.pow(secondScore, 3);
            }

            // 3셋 점수
            if(list.get(7) == "D"){
                Math.pow(secondScore, 2);
            }
            else if(list.get(7) == "T"){
                Math.pow(secondScore, 3);
            }

            // 012345678
            // 1D*2D*3D*
            // option
            firstScore *= 2;

            if(list.get(5) == "*"){
                firstScore *= 2;
                secondScore *= 2;
            }
            else if(list.get(5) == "#"){
                secondScore *= (-1);
            }

            if(list.get(8) == "*"){
                secondScore *= 2;
                thirdScroe *= 2;
            }
            else if(list.get(8) == "#"){
                thirdScroe *= (-1);
            }
            result = firstScore + secondScore + thirdScroe;
        }
        answer = result;
        return answer;
    }
}



