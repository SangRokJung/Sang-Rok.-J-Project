package hello0609.student;

public class MiddleSubjectScore {
	private String term;	// �б�
	
	private int kor;		// �����
	private int eng;		// �����
	private int mth;		// ���м���
	private int sci;		// ���м���

	public MiddleSubjectScore()
	{
		
	}

	public MiddleSubjectScore(String _term, int _kor, int _eng, int _mth, int _sci) 
	{
		this.term = _term;
		this.kor = _kor;
		this.eng = _eng;
		this.mth = _mth;
		this.sci = _sci;
	}
	
	public boolean setScore(String _term, int _kor, int _eng, int _mth, int _sci) 
	{
		this.term = _term;
		this.kor = _kor;
		this.eng = _eng;
		this.mth = _mth;
		this.sci = _sci;
		
		return true;
	}

}
