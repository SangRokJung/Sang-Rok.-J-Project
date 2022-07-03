package hello0613;

public class Node {
	private NodeData 	data;		// ��嵥����
	private Node 		next;		// ��������� ��ũ����.

	public Node()
	{
		data = null;
		next = null;
		
	}

	public Node(NodeData _data)
	{
		data = _data;
		next = null;
	}
	
	public Node(int _value1, String _value2)
	{
		data = new NodeData(_value1, _value2);
		next = null;
	}
	
	public NodeData getData()
	{
		return data;
	} 
	
	public void setData(NodeData _data)
	{
		data = _data;
	} 
	
	public void setData(int _value1, String _value2)
	{
		data.setvalue1(_value1);
		data.setvalue2(_value2);
		
	}	
	
	public Node getNext()
	{
		return next;
	}
	
	
	public void setNext(Node _next)
	{
		next = _next;
	}
	
	
}
