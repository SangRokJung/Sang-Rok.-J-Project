package hello0609.student;

public class Student 
{
	protected String name;		// �̸�, 
	protected String birth;		// ������� 
	protected String gender;	// ����
	protected int  	 grade;		// �г�




	public Student()
	{
		
	}
		
	public Student(String _name, String _birth, String _gender, int _grade)
	{
		this.name 	= _name; 
		this.birth 	= _birth; 
		this.gender = _gender;
		this.grade	= _grade;
		
	}
	
	// public static boolean getTermIndex(String _term){
	// 	int term_index = 0;
	// 	switch(_term){
	// 		case "1-1": 
	// 			term_index = 0;
	// 		break;

	// 		case "1-2": 
	// 			term_index = 1;
	// 		break;

	// 		case "2-1": 
	// 			term_index = 2;
	// 		break;

	// 		case "2-2": 
	// 			term_index = 3;
	// 		break;

	// 		case "3-1": 
	// 			term_index = 4;
	// 		break;
			
	// 		case "3-2": 
	// 			term_index = 5;
	// 		break;

	// 		default:
	// 			term_index =-1;
	// 		break;
	// 	}

	// 	// retrun term_index;
	// }

	public String getName() 
	{
		return name;
	}
	
	public String getBirth() 
	{
		return birth;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public int getGrade() 
	{
		return grade;
	}

	public void setName(String _name) 
	{
		this.name = _name;
	}

	public void setBirth(String _birth) 
	{
		this.birth = _birth;
	}

	public void setGender(String _gender)
	{
		this.gender = _gender;
	}

	public void setGrade(int _grade) 
	{
		this.grade = _grade;
	}
	
	
}
