
public class Node 
{
	private double key;
	private String data;
	private Node left, right;
	public void setKey(double key)
	{
		this.key = key;
	}
	public double getKey()
	{
		return this.key;
	}
	public void setData(String data)
	{
		this.data = data;
	}
	public String getData()
	{
		return this.data;
	}
	public void setLeft(Node left)
	{
		this.left = left;
	}
	public Node getLeft()
	{
		return this.left;
	}
	public void setRight(Node right)
	{
		this.right = right;
	}
	public Node getRight()
	{
		return this.right;
	}
	public Node(double key, String data)
	{
		this.key = key;
		this.data = data;
		left = right = null;
	}
	public String toString()
	{
		return key + " " + data;
	}
}
	
