public class Tree
{
	private Node root;
	public Tree()
	{
		root = null;
	}
	public void setRoot(Node root)
	{
		this.root = root;
	}
	public Node getRoot()
	{
		return this.root;
	}
	public void treeInsert(Node z)
	{
		Node y = null;
		Node x = this.root;
		while (x != null)
		{
			y = x;
			if (z.getKey() < x.getKey())
			{
				x = x.getLeft();
			}
			else
			{
				x = x.getRight();
			}
		}
		if (y == null)
		{
			this.root = z;
		}
		else if (z.getKey() < y.getKey())
		{
			y.setLeft(z);
		}
		else
		{
			y.setRight(z);
		}
	}
	public void inorderTreeWalk(Node x)
	{
		if (x != null)
		{
			inorderTreeWalk(x.getLeft());
			System.out.println(x.getKey());
			inorderTreeWalk(x.getRight());
		}
	}
	public Node treeSearch(Node x, double k)
	{
		while (x != null && k != x.getKey())
		{
			if (k < x.getKey())
			{
				x = x.getLeft();			
			}
			else
			{
				x = x.getRight();
			}
		}
		return x;
	}
}