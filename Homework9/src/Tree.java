public class Tree
{
	private Node root;
	private final static boolean RED = false;
	private final static boolean BLACK = true;
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
			System.out.println(x);
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
	public void RBInsert(Tree T, Node z)
	{
		Node y = null;
		Node x = T.root;
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
		z.setParent(y);
		if (y == null)
		{
			T.root = z;
		}
		else if (z.getKey() < y.getKey())
		{
			y.setLeft(z);
		}
		else
		{
			y.setRight(z);
		}
		z.setLeft(null);
		z.setRight(null);
		z.setColor(RED);
		RBInsertFixUp(T, z);
	}
	public void RBInsertFixUp(Tree t, Node z)
	{
		Node y = null;
		while (z.getParent() != null && z.getParent().getColor() == RED)
		{
			if (z.getParent().getParent() != null && z.getParent() == z.getParent().getParent().getLeft())
			{
				y = z.getParent().getParent().getRight();
				if (y != null && y.getColor() == RED)
				{
					z.getParent().setColor(BLACK);
					y.setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					z = z.getParent().getParent();	
				}
				else
				{
					if (z == z.getParent().getRight())
					{
						z = z.getParent();
						z.leftRotate(t, z);
					}
					z.getParent().setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					z.rightRotate(t, z.getParent().getParent());
				}
			}
			else
			{
				y = z.getParent().getParent().getLeft();
				if (y != null && y.getColor() == RED)
				{
					z.getParent().setColor(BLACK);
					y.setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					z = z.getParent().getParent();	
				}
				else
				{
					if (z == z.getParent().getLeft())
					{
						z = z.getParent();
						z.rightRotate(t, z);
					}
					z.getParent().setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					z.leftRotate(t, z.getParent().getParent());
				}
			}
		}
		t.getRoot().setColor(BLACK);
	}
	
	
	
	
	
	
	
}