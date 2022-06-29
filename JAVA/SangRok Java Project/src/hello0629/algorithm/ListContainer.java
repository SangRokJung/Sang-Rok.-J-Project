package hello0629.algorithm;

public class ListContainer {
	
	private Node 	header;
	private int 	count;
	
	private int 	findNextCallCount;	// findNext�� ��� ȣ�� �Ͽ��°�?
	private int[] 	findResult;			// findFirst�� �� ���
	
	// DONE
	public ListContainer()
	{
		header = null;
		count = 0;	
		
		findResult = null;
		findNextCallCount = 0;
	
	}		
	
	private Node getLastNode()
	{
		Node lastNode = header;
		
		for (int i = 0; i < count - 1; i++)
		{
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
		
	}
	
	
	// DONE ��带 �߰��Ѵ�. 
	public boolean insertNode()
	{
		Node lastNode = null;
		//1. ���ο� ��带 �ϳ� �����Ѵ�.
		Node newNode = new Node();
		
		if (count == 0)
		{
			// ����� ������.
			header = newNode;
		}
		else
		{
			// ������ ����� ��ũ�� ������.
			lastNode = getLastNode();
			lastNode.setNext(newNode);
		}
		
		count++;		
		return true;
	}

	// DONE
	public boolean insertNode(Node _newNode)
	{
		Node lastNode = null;				 
		
		if (count == 0)
		{
			// ����� ������.
			header = _newNode;
		}
		else
		{
			// ������ ����� ��ũ�� ������.
			lastNode = getLastNode();
			lastNode.setNext(_newNode);
		}
		
		count++;		
		return true;
	
	}	

	// DONE
	public boolean insertNode(int _value1, String _value2)
	{
		Node lastNode = null;
		//1. ���ο� ��带 �ϳ� �����Ѵ�.
		
		Node newNode = new Node(_value1, _value2);
		
		if (count == 0)
		{
			// ����� ������.
			header = newNode;
		}
		else
		{
			// ������ ����� ��ũ�� ������.
			lastNode = getLastNode();
			lastNode.setNext(newNode);
		}
		
		count++;		
		return true;
	}

	public boolean deleteNodebyIndex(int _index)
	{
		Node target = header;
		Node before = null;
		
		// count�� ��ȿ�� �˻�
		if (count == 0)
			return false;
		
		// index�� ��ȿ���� �˻�
		if ((count <= _index) ||  (_index < 0))
			return false;
		
		//1. target�� before�� ã�´�.		
		for (int i = 0; i < _index; i++)
		{
			before = target;
			target = target.getNext();
		}
		
		// 0�� �ε����� �������� �ǹ�
		if (before == null)
			header = target.getNext();
		else
			before.setNext(target.getNext());	
		
		count--;
		return true;
	}
	
	 
	public int findFirst(int _value)
	{
		findResult = findNode(_value);
		return findResult.length;
			
	}
	
	
	public int findFirst(String _value)
	{
		findResult = findNode(_value);
		return findResult.length;
		
	}
	
	public int findNext()
	{	
		if (findNextCallCount == findResult.length)
		{
			findNextCallCount  = 0;
			findResult = null;
			return -1;
		}
		else
			return findResult[findNextCallCount++];		
		
	}
	
	public int[] findNode(int _value)
	{	
		int [] result = null;
		
		Node target = header;
		NodeData data = null;
		int dataCount = 0;
		int idx = 0;
		
		// 1. _value�� ���� ���� ���� ����� ������ ���Ѵ�.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data�� �����Ѵ�.
			if (null != data)				
			{
				if (_value == data.getvalue1())
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		// 2. ã�� ������ ������ŭ �迭�� �����.
		result = new int[dataCount];
		target = header;
		
		// 3. �ε����� ã�Ƽ� �迭�� ä���ش�.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data�� �����Ѵ�.
			if (null != data)				
			{
				if (_value == data.getvalue1())
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;
	}
	
	// String ���� ã�Ƽ� �ش� ��带 �����Ѵ�.
	// 12:05 ����  �����غ��ô�.
	public int[] findNode(String _value)
	{
		int [] result = null;
		
		Node target = header;
		NodeData data = null;
		int dataCount = 0;
		int idx = 0;
		
		// 1. _value�� ���� ���� ���� ����� ������ ���Ѵ�.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data�� �����Ѵ�.
			if (null != data)				
			{
				if (_value.equals(data.getvalue2()))
					dataCount++;
					
			}
			
			target = target.getNext();
		}
		
		// 2. ã�� ������ ������ŭ �迭�� �����.
		result = new int[dataCount];
		target = header;
		
		// 3. �ε����� ã�Ƽ� �迭�� ä���ش�.
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			// data�� �����Ѵ�.
			if (null != data)				
			{
				if (_value.equals(data.getvalue2()))
				{
					result[idx] = i;
					idx++;			
					
				}
					
			}
			
			target = target.getNext();
		}
		
		return result;
		
	}
	
	// DEV
	// ���� ���� ���� ������ �����ϴ� findData�Լ��� ��� ���Ұ��ΰ�?
	
		
	// ��� �����͸� �����Ѵ�.
	public NodeData getNodeData(int _index)
	{
		Node target = header;
		NodeData data = null;
		
		if ((count <= _index) || (_index < 0))
			return null;		
			
		for (int i = 0; i < _index; i++)
			target = target.getNext();
		
		data = target.getData();
		
		return data;		
		
	}
	
	public boolean setNodeData(int _index, NodeData _data)
	{
		Node target = header;
		
		if ((count <= _index) || (_index < 0))
			return false;		
				
		for (int i = 0; i < _index; i++)
			target = target.getNext();			
		
		target.setData(_data);
		
		return true;
	}
	
	public int getNodeCount()
	{
		return count;
	}

	// ��� ��带 ���.
	// index = 0
	// 1, "abc"
	public void printAll()
	{
		Node target = header;
		NodeData data = null;
		
		for (int i = 0; i < count; i++)
		{
			data = target.getData();
			
			System.out.println("index = " + i);

			if (null == data)				
				System.out.println("null");
			else
				System.out.printf("%d, %s\n", data.getvalue1(), data.getvalue2());
				
			System.out.println("-------------------");
			
			target = target.getNext();
		}
				
	}

}
