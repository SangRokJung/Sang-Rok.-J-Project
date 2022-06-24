package hello0624.algorithm;

public class DoubleListContainer {
	private Node header;
	private int count;
	
	public DoubleListContainer()
	{
		header = null;
		count = 0;		
	}
	
	
	public Node getNode(int index)
	{
		Node result = header;
		
		if (index >= count)
			return null;
		
		for (int i = 0; i < index; i++)		
			result = result.getNext();
		
		return result;
		
	}

	
	
	
	// ����
	// �� �ڿ�
	public boolean InsertNode()
	{
		Node target = null;
		Node newNode = new Node();
		
		// ��尡 �ϳ��� ����.
		if (count == 0)
		{
			header = newNode;			
		}
		else
		{
			// ������ ��带 ������ �ͼ� �� �ڿ� ������.
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
		count++;
		return true;
	}

	// ����
	// pos�� �ǵ��� pos >= count : ���ڿ� �ִ´�.
	public boolean InsertNode(int pos)
	{
		Node target = null;
		Node newNode = new Node();
		
		if (pos < 0)
		{
			return false;
		}
		
		
		if (count == 0)
		{
			//OK
			header = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			header = newNode;
			
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
			
		}
		
		count++;
		return true;
	}

	// new ���
	// �� �ڿ�
	public boolean InsertNode(Node _newNode)
	{
		Node target = null;
		Node newNode = _newNode;
		
		// ��尡 �ϳ��� ����.
		if (count == 0)
		{
			header = newNode;			
		}
		else
		{
			// ������ ��带 ������ �ͼ� �� �ڿ� ������.
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
		count++;

		return true;
	}
	
	// new ���
	// pos�� �ǵ���		
	public boolean InsertNode(Node _newNode, int pos)
	{
		Node target = null;
		Node newNode = _newNode;
		
		if (pos < 0)
		{
			return false;
		}
		
		
		if (count == 0)
		{
			//OK
			header = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			header = newNode;
			
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
			
		}
		
		count++;
		return true;
		
	}
	
	
	// new ���
	// �� �ڿ�
	public boolean InsertNode(NodeData _newNodeData)
	{
		Node target = null;
		Node newNode = new Node();
		
		newNode.setData(_newNodeData);
		
		// ��尡 �ϳ��� ����.
		if (count == 0)
		{
			header = newNode;			
		}
		else
		{
			// ������ ��带 ������ �ͼ� �� �ڿ� ������.
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
		count++;
		
		return true;
	}
		
	// new ���
	// pos�� �ǵ���		
	public boolean InsertNode(NodeData _newNodeData, int pos)
	{
		Node target = null;
		Node newNode = new Node();
		newNode.setData(_newNodeData);
		
		if (pos < 0)
		{
			return false;
		}
		
		
		if (count == 0)
		{
			//OK
			header = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			header = newNode;
			
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
			
		}
		
		count++;
		return true;
	}
		

	// value
	// �� �ڿ�
	public boolean InsertNode(int _value1, String _value2)
	{
		Node target = null;
		
		Node newNode = new Node();
		newNode.setData(_value1, _value2);
		
		// ��尡 �ϳ��� ����.
		if (count == 0)
		{
			header = newNode;			
		}
		else
		{
			// ������ ��带 ������ �ͼ� �� �ڿ� ������.
			target = getNode(count - 1);
			
			target.setNext(newNode);
			newNode.setPrev(target);
		}
		
		count++;
		return true;		
	}
		
	// new ���
	// pos�� �ǵ���		
	public boolean InsertNode(int _value1, String _value2, int pos)
	{
		Node target = null;
		
		Node newNode = new Node();
		newNode.setData(_value1, _value2);
		
		if (pos < 0)
		{
			return false;
		}
			
		if (count == 0)
		{
			//OK
			header = newNode;
			
		}
		else if (pos > count)
		{
			//OK
			target = getNode(count - 1);
			target.setNext(newNode);
			newNode.setPrev(target);
			
		}
		else if (pos == 0)
		{
			// OK
			target = getNode(pos);
			
			newNode.setNext(target);
			target.setPrev(newNode);
			
			header = newNode;
			
		}
		else
		{
			target = getNode(pos);
			
			newNode.setNext(target);
			newNode.setPrev(target.getPrev());
			
			target.setPrev(newNode);
			newNode.getPrev().setNext(newNode);
			
		}
		
		count++;			
		return true;
	
	}
		
	public boolean deleteNodebyIndex(int _index)
	{
		Node target = null;
		Node prevNode = null;
		Node nextNode = null;
		
		if (count <= _index)
			return false;

		target = getNode(_index);
		
		if (_index == 0)
		{
			nextNode = target.getNext();			
		
			nextNode.setPrev(null);
			header = target.getNext();
			
		}
		else if (_index == (count-1))
		{			
			prevNode = target.getPrev();
			prevNode.setNext(null);
			
		}
		else
		{					
			prevNode = target.getPrev();
			nextNode = target.getNext();
			
			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);
					
		}
		
		count--;
		return true;
	}

	public int deleteNodebyValue(int _value1)
	{		
		int delCount = 0;
		int i = 0;
		Node target = header;
		NodeData data = null;
		
		do
		{
			// 1. �����͸� �����´�. 
			data = target.getData();
			
			// �����Ͱ� ������ ���̸�
			if (_value1 == data.getvalue1())
			{
				//����� ���� Ƚ�� ����
				deleteNodebyIndex(i - delCount);
				delCount++;
							
			}

			// Ÿ���� �������� �ű��.
			target = target.getNext();							
			i++;
			
		} while(target != null);
		
		return delCount;
		
	}
	
	public int deleteNodebyValue(String _value2)
	{
		return 0;
	}
	
	public int deleteNodebyValue(int _value1, String _value2)
	{
		return 0;
	}
	
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
