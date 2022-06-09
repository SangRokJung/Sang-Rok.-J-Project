package hello0608;

public class Student {
        // Every Students has name, birth, sex information.
        protected String name = "0";
        protected int birth = 0;
        protected String sex = "0";

        //Coustructor
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



        //ID output.
        public void getID(){
            System.out.println("Name : " + name);
            System.out.println("Birth : " + birth);
            System.out.println("Sex : " + sex);
        }

        public void aveSub(String string) {
        }

        public void aveTerms(String string) {
        }

        public void aveGrade(int i) {
        }

}
