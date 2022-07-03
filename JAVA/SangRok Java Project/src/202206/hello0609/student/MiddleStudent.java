package hello0609.student;


public class MiddleStudent extends Student{

	public static final int TERM_COUNT = 6;

	private String group;					
	private MiddleSubjectScore[] score;		

	public MiddleStudent(){
		score = new MiddleSubjectScore[TERM_COUNT];
	}
	
	public MiddleStudent(String _group){
		this();
		group = _group;
	}


	// public boolean setScore (String _term, int _kor, int _eng, int _mth, int _sci) 
	// {
	// 	int terIndex = Stdudent.getTermIndex(_term);

	// 	if(){

	// 	}

	// }


	public float getSubjectAverage(String subject)
	{
		return 0;
	}

}



