package hello0609;

public class Queue {
	public static final int DEFAULT_SIZE = 5;
	
	private int[] frame;		// queue�� �迭
	private int size;			// queue frame�� ũ��
	private int rear;			// enqueue�� ���� ��ġ����
	private int front;			// dequeue�� ���� ��ġ����
	private int count;			// queue�� ����ִ� data count
	
	public Queue()
	{
		size = DEFAULT_SIZE;
		frame = new int[size];
		rear = 0;
		front = 0;
		count = 0;
		
	}
	
	
	public Queue(int _size)
	{
		size = _size;
		frame = new int[size];
		rear = 0;
		front = 0;		
		count = 0;
		
	}
	
	public int getSize()
	{
		return size;
		
	}
	
	public int getCount()
	{
		return count;
		
	}
	
	private boolean	isFull()
	{
		if (count == size)
			return true;
		
		return false;
		
	}
	
	private boolean	isEmpty()
	{
		if (count == 0)
			return true;
		
		return false;
	
	}
	
	public boolean enqueue(int _data)
	{
		if (isFull())
			return false;
		
		//�����͸� �־��ش�.
		rear = rear % size;
		frame[rear] = _data;
		
		rear++;
		count++;
		
		return true;
	}
	
	
	public int dequeue()
	{
		int result;
		if (isEmpty())
			return Integer.MIN_VALUE;
		
		front = front % size;
		result = frame[front];
		
		front++;
		count--;
		return result;
		
	}
		
	public void printAll()
	{
		int idx = 0;		
		idx = rear - 1;
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(frame[idx - i]);
			
		}
		
	}
	
	public String toString()
	{
		// ���Ŀ� queue�� ������ �����ϴ� ���ڿ��� ��ü.
		return getClass().getName();
	}
	
}
