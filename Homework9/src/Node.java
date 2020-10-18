
public class Node 
{
	private double key;
	private String data;
	private Node left, right;
	private boolean color;
	private Node parent;
	public Node(double key)
	{
		this.key = key;
		this.data = null;
		left = right = null;
	}
	public Node(double key, String data)
	{
		this.key = key;
		this.data = data;
		left = right = null;
	}
	public void setColor(boolean color)
	{
		this.color = color;
	}
	public boolean getColor()
	{
		return this.color;
	}
	public void setParent(Node parent)
	{
		this.parent = parent;
	}
	public Node getParent()
	{
		return this.parent;
	}
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
	public void leftRotate(Tree T, Node x)
	{
		Node y = x.getRight();
		x.setRight(y.getLeft());
		if (y.getLeft() != null)
		{
			y.getLeft().setParent(x);
		}
		y.setParent(x.getParent());
		if (x.getParent() == null)
		{
			T.setRoot(y);
		}
		else if (x == x.getParent().getLeft())
		{
			x.getParent().setLeft(y);
		}
		else
		{
			x.getParent().setRight(y);
		}	
		y.setLeft(x);
		x.setParent(y);
	}
	public void rightRotate(Tree T, Node x)
	{
		Node y = x.getLeft();
		x.setLeft(y.getRight());
		if (y.getRight() != null)
		{
			y.getRight().setParent(x);
		}
		y.setParent(x.getParent());
		if (x.getParent() == null)
		{
			T.setRoot(y);
		}
		else if (x == x.getParent().getRight())
		{
			x.getParent().setRight(y);
		}
		else
		{
			x.getParent().setLeft(y);
		}	
		y.setRight(x);
		x.setParent(y);
	}
	public String toString()
	{
		if (color == false)
		{
			return key + data + " RED";
		}
		else
		{
			return key + data + " BLACK";
		}
	}
	
}
	
