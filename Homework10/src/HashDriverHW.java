import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashDriverHW 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		long start, end, time;
		Scanner scanner = new Scanner(new File("UPC-random.csv"));
		Scanner scanner2 = new Scanner(new File("input.dat"));
		HashMap map1 = new HashMap("basic");
		HashMap map2 = new HashMap("linear");
		HashMap map3 = new HashMap("quadratic");
		
//		map2.put(33, "yeaah");
//		System.out.println(map2.get(33));
		
		start = System.nanoTime();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			double key = Double.valueOf(line.substring(0, line.indexOf(",")));
			String data = line.substring(line.indexOf(",") + 1, line.length());
			//System.out.println(key + data);
			//map1.put(key, data);
			map2.put(key, data);
			//map3.put(key, data);
		}

		while (scanner2.hasNextLine())
		{
			String line = scanner2.nextLine();
			double key = Double.valueOf(line.substring(0, line.indexOf(",")));
			String data = line.substring(line.indexOf(",") + 1, line.length());
			//System.out.println(map1.get(key));
			System.out.println(map2.get(key));
			//System.out.println(map3.get(key));
		}
		end = System.nanoTime();
		time = end - start;
		System.out.println("Time: " + time/1000000.0);
}
}
