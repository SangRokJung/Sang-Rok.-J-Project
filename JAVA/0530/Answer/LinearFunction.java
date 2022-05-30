public class LinearFunction {
	public double 	gradient;		// ����
	public double 	yIntercept;		// y����
	
	
	//1���Լ��� ����� 3���� ���
	// x����, y������ �̿��ϴ� ���
	public LinearFunction()
	{
		gradient = 0;
		yIntercept = 0;
	
		
	}
	
	public LinearFunction(double _gradient, double _yIntercept)
	{
		gradient 	= _gradient;
		yIntercept 	= _yIntercept;
		
	}
	
	// ������ ���� �� ����� y������ ���Ѵ�. 
	public LinearFunction(Pos pos1, Pos pos2)
	{
		// ����.
		double gd = 0;
		double yic = 0;
		gd = (pos2.y - pos1.y) / (pos2.x - pos1.x);						
		yic = pos1.y - (gd * pos1.x); 		
		
		gradient = gd;
		yIntercept = yic;	
		
		
	}
	
	public double getValue(double x)
	{
		return gradient * x + yIntercept;		
		
	}
	
	
	public String printForm()
	{
		return "y = " +  gradient + "x" + " + " + yIntercept;
		
		
	}
	

}
