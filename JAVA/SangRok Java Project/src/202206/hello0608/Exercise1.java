package hello0608;

import java.util.Arrays;

public class Exercise1 {

    // Semester grade setting by subject.
    public static double [][] ranScore(int sub, int terms){
        double[][] result = new double [sub][terms];

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                result[i][j] =(int)(Math.random() * 100) + 1;
            }

        }
        return result;
    }

    // high school grades
    public static double [][] h1Score = ranScore(6, 6);
    public static double [][] h2Score = ranScore(6, 6);

    // middle school grades
    public static double [][] m1Score = ranScore(4, 6);
    public static double [][] m2Score = ranScore(4, 6);


    // A Stdudent Average by 1year.
    // public static double termsAverage(double[][] data){
    //     double result = 0;
    //     double total = 0;

    //     for(int i=0; i<data.length; i++){
    //         for(int j=0; j<data[i].length; j++){
    //             total += data[i][j];
    //         }
    //     }
    //     return result / (data.length * data[0].length);
    // }


    // public static double h1Average = termsAverage(h1Score);
    // public static double h2Average = termsAverage(h2Score);

    // public static double m1Average = termsAverage(m1Score);
    // public static double m2Average = termsAverage(m2Score);

	public static void main(String[] args) {

        Student[] student = new Student[10];
        int count = 0;

        // high school students
        student[count++] = new hStudent("Jung", 981110, "Man", 3, 1, h1Score);
        student[count++] = new hStudent("Sang", 941160, "Woman", 3, 1, h2Score);


        // middle school students
        student[count++] = new mStudent("Rok", 901160, "Woman", 3, 1, m1Score);
        student[count++] = new mStudent("James", 901160, "Man", 3, 1, m2Score);


        for(int i = 0; i < count; i++){
            student[i].getID();
            student[i].aveSub("Kor");
            student[i].aveTerms("1-1");
            student[i].aveGrade(1);
            System.out.println("");
        }
    }

}
