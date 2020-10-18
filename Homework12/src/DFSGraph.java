import java.util.LinkedList;

public class DFSGraph 
{
	private int vertex;
	LinkedList<Integer> adj[];
	LinkedList<Integer> vertices = new LinkedList<>();
	final static int WHITE = 0;
	final static int GRAY = 1;
	final static int BLACK = 2;
	int[] color;
	int[] distance;
	Integer[] parent;
	int[] finished;
	int time;
	
	public DFSGraph(int vertex)
	{
		this.vertex = vertex;
		adj = new LinkedList[vertex];
		color = new int[vertex];
		distance = new int[vertex];
		parent = new Integer[vertex];
		finished = new int[vertex];
		
		for (int i = 0; i < vertex; i ++)
		{
			adj[i] = new LinkedList<>();
		}
	}
	public void setVertex(int vertex)
	{
		this.vertex = vertex;
	}
	public int getVertex()
	{
		return this.vertex;
	}
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	public void DFS(DFSGraph G)
	{
		for (int u = 0; u < G.getVertex(); u++) 
		{
			color[u] = WHITE;
			parent[u] = null;
		}
		time = 0;
		for (int u = 0; u < G.getVertex(); u++)
		{
			if (color[u] == WHITE) 
			{
				DFSVisit(G, u);
			}
		}
	}
	public void DFSVisit(DFSGraph G, int u)
	{
		time += 1;
		distance[u] = time;
		color[u] = GRAY;
		for (int i = 0; i < adj[u].size(); i++)
		{
			int v = adj[u].get(i);
			if (color[v] == WHITE)
			{
				parent[v] = u;
				DFSVisit(G, v);
			}
		}
		color[u] = BLACK;
		time += 1;
		finished[u] = time;
		vertices.push(u);
	}
	public void printPath(DFSGraph G, int s, int v)
	{
		if (v == s)
		{
			System.out.print(s + ", ");
		}
		else if (parent[v] == null)
		{
			System.out.print(v + ", ");
		}
		else
		{
			printPath(G, s, parent[v]);
			System.out.print(v + ", ");
		}
	}
	public void printGraph() 
    {        
        for(int v = 0; v < getVertex(); v++) 
        { 
            System.out.print("vertex "+ v + ": ");  
            for(Integer verteces: adj[v]){ 
                System.out.print(verteces + " "); 
            } 
            System.out.println("\n"); 
        } 
    }
}
