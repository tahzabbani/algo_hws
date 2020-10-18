import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class UndirectedGraphDriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		long start, end, time;
		final int SOURCE = 0;
		Scanner scanner = new Scanner(new File("mediumG.txt"));
		int i, j;
		int v = Integer.parseInt(scanner.nextLine());
		int e = Integer.parseInt(scanner.nextLine());
		UndirectedGraph graph = new UndirectedGraph(v);
		start = System.nanoTime();
		while (scanner.hasNextLine())
		{
			i = scanner.nextInt();
			j = scanner.nextInt();
			graph.addEdge(i, j);
		}
		graph.BFS(graph, SOURCE);
		end = System.nanoTime();
		time = end - start;
		for (int q = 0; q < graph.getVertex(); q++)
		{
			System.out.println("\nFrom " + SOURCE + " to " + q + "\n");
			graph.printPath(graph, SOURCE, q);
		}
		System.out.println("it took " + time/1000000.0 + " ms");
	}
}

