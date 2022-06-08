package hello0608;

public class Student {
            // 모든 학생은 이름, 생년월일, 성별 정보가 있음
        // Every Students has name, birth, sex information.
        String name = "0";
        int birth = 0;
        String sex = "0";

        public Student(){
            this.name = "None name";
            this.birth = 000000;
            this.sex = "None sex";
        }

        public Student(String _name, int _birth, String _sex){
            this.name = _name;
            this.birth = _birth;
            this.sex = _sex;
        }


        //name output.
        public String getName(){
            return this.name;
        }


        //Method
        //Average by Grade.
        public double aveGrade(int grade){
            double result = 0.0;
            if(grade == 1){
                
            }
            else if(grade == 2){

            }
            else if(grade == 3){

            }
            else{

            }


            return result;
        }

}
