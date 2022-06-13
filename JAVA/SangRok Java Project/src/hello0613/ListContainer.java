package hello0613;

public class ListContainer {
	private Node 	header;
	private int 	count;

	
	// DONE
	public ListContainer()
	{
		header = null;
		count = 0;		
		
	}		
	
	// DONE
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
	
	public boolean insertNode(int _value1, int value2)
	{
		
		return true;
	}
	
	public boolean insertNode(Node newNode)
	{

		return true;
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ��带 �����.
	public boolean deleteNodebyIndex(int index)
	{
		return true;
	}
	
	// int���� ã�Ƽ� �ش� ��� ��ġ �����Ѵ�.
	public int findNode(int value)
	{
		return 0;
		
	}
	
	// String ���� ã�Ƽ� �ش� ��带 �����Ѵ�.
	public int findNode(String value)
	{
		return 0;
		
	}
	
	// ��� �����͸� �����Ѵ�.
	public NodeData getNodeData(int index)
	{
		return null;
	}
	
	// ��� ������ �����Ѵ�.
	public int getNodeCount()
	{
		return 0;
	}

	// ��� ��带 ���.
	public void printAll()
	{
		
	}


}
