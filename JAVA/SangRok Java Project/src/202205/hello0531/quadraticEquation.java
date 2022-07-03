package hello0531;

public class quadraticEquation {
    // 2차 방정식이 주어졌을 때 근을 구하는 클래스를 구현하시오.
    // ax^2 + bx + c = 0
    private double a;
    private double b;
    private double c;



    public quadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSolution(boolean bPlus){
        double solution = 0;

        double d = Math.pow(b, 2) - (4*a*c);

        if (d < 0){
            System.out.println("허근입니다.");
            return 0;
        }

        if(bPlus == true){
            solution = (-b + Math.sqrt(d)) / (2 * a);
        }
        else{
            solution = (-b - Math.sqrt(d)) / (2 * a);
        }

        return solution;
    };

}