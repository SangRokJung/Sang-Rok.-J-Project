package hello0530.Answer;

public class Hello {

	public static void main(String[] args) {
		
		LinearFunction lf = new LinearFunction(new Pos(1, 0), new Pos(0, 5));

		System.out.println(lf.printForm());
		System.out.println(lf.getValue(3));
		
	}

}



