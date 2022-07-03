package hello0608;

public class Student {
        // Every Students has name, birth, gender information.
        protected String name = "0";
        protected int birth = 0;
        protected String gender = "0";

        //Coustructor
        public Student(){
            this.name = "None name";
            this.birth = 000000;
            this.gender = "None gender";
        }

        public Student(String _name, int _birth, String _gender){
            this.name = _name;
            this.birth = _birth;
            this.gender = _gender;
        }



        //ID output.
        public void getID(){
            System.out.println("Name : " + name);
            System.out.println("Birth : " + birth);
            System.out.println("gender : " + gender);
        }

        public void aveSub(String string) {
        }

        public void aveTerms(String string) {
        }

        public void aveGrade(int i) {
        }

}
