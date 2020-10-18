import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFSDriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		final int SOURCE = 0;
		long start, end, time;
		Scanner scanner = new Scanner(new File("tinyDG.txt"));
		int v = Integer.parseInt(scanner.nextLine());
		int e = Integer.parseInt(scanner.nextLine());
		DFSGraph graph = new DFSGraph(v);
		while (scanner.hasNextLine())
		{
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			double weight = scanner.nextDouble();
			graph.addEdge(i, j);
		}
		start = System.nanoTime();
		graph.DFS(graph);
		end = System.nanoTime();
		time = end - start;
		for (int q = 0; q < graph.getVertex(); q++)
		{
			System.out.print("\nFrom " + SOURCE + " to " + q + ": ");
			graph.printPath(graph, SOURCE, q);
		}
		System.out.println("\nTopological Sort: " + graph.vertices);
		System.out.println("The DFS took " + time/1000000.0 + " ms");
	}

}
