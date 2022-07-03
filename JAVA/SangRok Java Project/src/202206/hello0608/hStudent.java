package hello0608;


public class hStudent extends Student {
    // Hight Students has grade, class, 6 subjects and score of six semesters per subject.
    private int hGrade;
    private int hVan;
    private String [] hSubject = {"Kor", "Eng", "Math", "Sci", "Sco", "His"};
    private double [][] hSubjectScore = new double [6][6];



    public hStudent(){
        this.hGrade = 0;
        this.hVan = 0;
    }
    public hStudent(String _name, int _birth, String _sex, int _hGrade, int _hVan, double [][] hScore){
        super(_name, _birth, _sex);
        this.hGrade = _hGrade;
        this.hVan = _hVan;
        this.hSubjectScore = hScore;      
    }

    //set Score
    public void setScore(double [][] hScore){
        this.hSubjectScore = hScore;
    }

    //Method
    //Average by subjects
    public void aveSub(String sub){
        double result = 0f;
        double totalScore = 0f;

        if(sub.equals("Kor")){
            for(int i=0; i<hSubjectScore[0].length; i++){
                totalScore += hSubjectScore[0][i];
            }
        }
        else if(sub.equals("Eng")){
            for(int i=0; i<hSubjectScore[1].length; i++){
                totalScore += hSubjectScore[1][i];
            }
        }
        else if(sub.equals("Math")){
            for(int i=0; i<hSubjectScore[2].length; i++){
                totalScore += hSubjectScore[2][i];
            }
        }
        else if(sub.equals("Sci")){
            for(int i=0; i<hSubjectScore[3].length; i++){
                totalScore += hSubjectScore[3][i];
            }
        }
        else if(sub.equals("Sco")){
            for(int i=0; i<hSubjectScore[3].length; i++){
                totalScore += hSubjectScore[4][i];
            }
        }
        else if(sub.equals("His")){
            for(int i=0; i<hSubjectScore[3].length; i++){
                totalScore += hSubjectScore[5][i];
            }
        }
        else{
            result = 0f;
        }
        result = totalScore /  hSubjectScore[0].length;
        System.out.println(sub + " Average is " + Math.ceil(result));
    }
    //Average by terms
    public void aveTerms(String terms){
        double result = 0.0f;
        double totalScore = 0.0f;

        if(terms.equals("1-1")){
            for(int i=0; i<hSubjectScore.length; i++){
                totalScore += hSubjectScore[i][0];
            }
        }
        else if(terms.equals("1-2")){
            for(int i=0; i<hSubjectScore.length; i++){
                totalScore += hSubjectScore[i][1];
            }
        }
        else if(terms.equals("2-1")){
            for(int i=0; i<hSubjectScore.length; i++){
                totalScore += hSubjectScore[i][2];
            }
        }
        else if(terms.equals("2-2")){
            for(int i=0; i<hSubjectScore.length; i++){
                totalScore += hSubjectScore[i][3];
            }
        }
        else if(terms.equals("3-1")){
            for(int i=0; i<hSubjectScore.length; i++){
                totalScore += hSubjectScore[i][4];
            }
        }
        else if(terms.equals("3-2")){
            for(int i=0; i<hSubjectScore.length; i++){
                totalScore += hSubjectScore[i][5];
            }
        }
        else{
            result = 0f;
        }
        result = totalScore /  hSubjectScore[0].length;
        System.out.println(terms + " Average is " + Math.ceil(result));
    }
    //Average by grade.
    public void aveGrade(int grade){
        double result = 0;
        double total = 0;
        for(int i=0; i<hSubjectScore.length; i++){
            for(int j=0; j<hSubjectScore[i].length; j++){
                total += hSubjectScore[i][j];
            }
        }
        result = total / (hSubjectScore.length*hSubjectScore[0].length);
        
        System.out.println(grade + " Grade Average is "+ Math.ceil(result));
    }



    @Override
    // ID OUTPUt
    public void getID(){
        super.getID();
        System.out.println("Grade : " + hGrade);
        System.out.println("Van : " + hVan);
    }

}
