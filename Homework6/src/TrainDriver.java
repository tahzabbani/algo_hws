import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrainDriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String[] cities = new String[17];
		File input = new File("NovelSortInput.txt");
		Scanner scanner = new Scanner(input);
		for (int i = 0; i < cities.length; i++)
		{
				cities[i] = scanner.nextLine();
				if (i < 16)
				{
					scanner.nextLine(); // discards the space between lines
				}
		}
		long start, end, time;
		start = System.nanoTime();
		TrainSorting sort = new TrainSorting();
		sort.sortNames(cities);
		end = System.nanoTime();
		time = end - start;
		for (int i = 0; i < cities.length; i++)
		{
			System.out.println(cities[i]);
		}
		System.out.println(time/1000000.0 + " ms");
		scanner.close();
		
	}
}
