import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DifferentSortsFileDriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		long start, end;
		long insertTime;
		Scanner scanner = new Scanner(new File("Input_Random.txt"));
		Scanner scanner2 = new Scanner(new File("Input_ReversedSorted.txt"));
		Scanner scanner3 = new Scanner(new File("Input_Sorted.txt"));
		
		String[] files = {"Random", "Reverse Sorted", "Sorted"};
		
		int[] arr1 = new int[1024];
		int[] arr2 = new int[1024];
		int[] arr3 = new int[1024];
		
		int[][] arrs = {arr1, arr2, arr3};
	
		int i = 0;
		while(scanner.hasNextInt())
		{
			arr1[i++] = scanner.nextInt();
		}
		int i2 = 0;
		while(scanner2.hasNextInt())
		{
			arr2[i2++] = scanner2.nextInt();
		}
		int i3 = 0;
		while(scanner3.hasNextInt())
		{
			arr3[i3++] = scanner3.nextInt();
		}
		
		QuickSort obj = new QuickSort();
		start = System.nanoTime();
		for (int o = 0; o < arrs.length; o++)
	    {
	        	start = System.nanoTime();
	        	obj.quickSort(arrs[o], 0, arrs[o].length - 1);
	        	end = System.nanoTime();
	        	insertTime = end - start;
	        	System.out.println((files[o]) + " array" + " execution time: " + insertTime/1000000.0 + " ms");
	    }
	}

}
