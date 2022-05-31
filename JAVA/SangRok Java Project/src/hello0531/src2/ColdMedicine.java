package hello0531.src2;

class FeverReducer
{
	public void take()
	{
		System.out.println("���� ��������.");
	}
	
}


class CoughMedicine
{
	public void take()
	{
		System.out.println("��ħ�� �ܾ���.");
	}
	
	

}

public class ColdMedicine {
	
	// �ؿ����� �Դ´�.
	private void takeFeverReducer()
	{
		FeverReducer fr = new FeverReducer();
		fr.take();
		
	}
	
	private void takeCoughMedicine()
	{
		CoughMedicine cm = new CoughMedicine();
		cm.take();
		
	}
	
	public void take()
	{
		takeFeverReducer();
		takeCoughMedicine();
		
	}
	
}
