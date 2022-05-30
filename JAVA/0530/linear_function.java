// public class linear_function {
//     //1차 함수
//     //y = ax * b

//     public double gradient = 0;     //기울기
//     public double yIntercept = 0;   //y절편

//     public LinearFunction(){
//         gradient    = 0;
//         yIntercept  = 0;
//     }

//     //1차 함수의 식 1.
//     public LinearFunction (double _gradient, double _yIntercept){
//         gradient    = _gradient;
//         yIntercept  = _yIntercept;
//     }

//     //두점을 지날 때 기울기와 좌표를 구한다.
//     public LinearFunction(Pos pos1, Pos pos2){
//         //기울기
//         double gd = 0;
//         double yic = 0;
//         gd =  (pos2.y - pos1.y) / (pos2.x - pos1.x);
        
//         pos1.y = gd * pos1.x + yic;

//         yic = pos1.y - (gd * pos1.x);

//         gradient = gd;
//         yIntercept = yic;
//     }

//     public double getValue(double x){
//         return  gradient * x + yIntercept;
//     }
   
//     public String printForm(){
//         return "y = " 
//     }
// }
