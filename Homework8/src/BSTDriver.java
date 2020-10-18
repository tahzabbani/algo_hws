import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BSTDriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		long start, end, time;
		Scanner scanner = new Scanner(new File("UPC-random.csv"));
		Scanner scanner2 = new Scanner(new File("input.dat"));
		Tree tree = new Tree();
		start = System.nanoTime();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			double key = Double.valueOf(line.substring(0, line.indexOf(",")));
			String data = line.substring(line.indexOf(",") + 1, line.length());
			Node node = new Node(key, data);
			tree.treeInsert(node);
		}
		while (scanner2.hasNextLine())
		{
			String line = scanner2.nextLine();
			double key = Double.valueOf(line.substring(0, line.indexOf(",")));
			String data = line.substring(line.indexOf(",") + 1, line.length());
			Node node = new Node(key, data);
			System.out.println(tree.treeSearch(tree.getRoot(), node.getKey()));
		}
		end = System.nanoTime();
		time = end - start;
		System.out.println(time/1000000.0 + " ms");
	}
}
