package hello0608;

import java.util.Arrays;

public class Exercise1 {
    public static double [][] h1Score = {
        {87, 45, 87, 57, 89, 57},
        {46, 55, 87, 79, 69, 70},
        {48, 95, 69, 96, 48, 36},
        {47, 96, 34, 86, 37, 69},
        {97, 45, 57, 57, 29, 57},
        {46, 95, 87, 79, 59, 90}
    };    
    public static double [][] m1Score = {
        {87, 45, 87, 57, 89, 57},
        {46, 55, 87, 79, 69, 70},
        {48, 95, 69, 96, 48, 36},
        {47, 96, 34, 86, 37, 69}
    };

	public static void main(String[] args) {


        Student S1 = new Student();
        mStudent mS1 = new mStudent("Jung", 981110, "Man", 3, 1);
        hStudent hS1 = new hStudent();

        hS1.setScore(h1Score);
        mS1.setScore(m1Score);

        System.out.println("MS Kor Average : " + mS1.aveSub("Kor"));
        System.out.println("MS Math Average : " + mS1.aveSub("Math"));

        System.out.println("MS 1-1 Average : " + mS1.aveTerms("1-1"));
        System.out.println("MS 3-1 Average : " + mS1.aveTerms("3-1"));


        System.out.println("HS Sco Average : " + hS1.aveSub("Sco"));
        System.out.println("HS His Average : " + hS1.aveSub("His"));

        System.out.println("HS 1-1 Average : " + hS1.aveTerms("1-1"));
        System.out.println("HS 3-1 Average : " + hS1.aveTerms("3-1"));

        System.out.println(mS1.getName());

    }


// 학기는 1-1, 1-2, 2-1, 2-2, 3-1, 3-2학기가 있음


// 필요한 메소드
// 과목별, 학기별 평균점수를 구하는 메소드 v
// 학년별 평균점수를 구하는 메소드
// 이름, 학년, 반을 출력하는 메소드 v
// 기타 필요한 메소드


}
