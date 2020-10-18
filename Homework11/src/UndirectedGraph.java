import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraph 
{
	private int vertex;
	LinkedList<Integer> adj[];
	final static int WHITE = 0;
	final static int GRAY = 1;
	final static int BLACK = 2;
	int[] color;
	int[] distance;
	Integer[] parent;
	
	public UndirectedGraph(int vertex)
	{
		this.vertex = vertex;
		adj = new LinkedList[vertex];
		color = new int[vertex];
		distance = new int[vertex];
		parent = new Integer[vertex];
		
		
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
	public void BFS(UndirectedGraph G, int s)
	{
		for (int i = 0; i < G.getVertex(); i++) {
			color[i] = WHITE;
			distance[i] = Integer.MAX_VALUE;
			parent[i] = null;
		}
		color[s] = GRAY;
		distance[s] = 0;
		parent[s] = null;
		LinkedList<Integer> q = new LinkedList<>();
		q.add(s);
		while (!q.isEmpty())
		{
			int u = q.remove();
			for (int i = 0; i < adj[u].size(); i++)
			{
				int v = adj[u].get(i);
				if (color[v] == WHITE)
				{
					color[v] = GRAY;
					distance[v] = distance[u] + 1; 
					parent[v] = u;
					q.add(v);
				}
			}
			color[u] = BLACK;
		}
	}
	public void printPath(UndirectedGraph G, int s, int v)
	{
		if (v == s)
		{
			System.out.println(s);
		}
		else if (parent[v] == null)
		{
			System.out.println("No path from " + s + " to " + v + " exists");
		}
		else
		{
			printPath(G, s, parent[v]);
			System.out.println(v);
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
