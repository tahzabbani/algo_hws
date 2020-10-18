import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class BubbleSelectionDriver 
{
		public static void main(String[] args) throws FileNotFoundException
		{
			long start, end, time;
			Scanner scanner1 = new Scanner(new File("Input_Random.txt"));
			Scanner scanner2 = new Scanner(new File("Input_ReversedSorted.txt"));
			Scanner scanner3 = new Scanner(new File("Input_Sorted.txt"));
			int[] arr1 = new int[1024];
			int[] arr2 = new int[1024];
			int[] arr3 = new int[1024];
			
			String[] files = {"Random", "Reverse Sorted", "Sorted"};
			int[][] arrs = {arr1, arr2, arr3};
			
			int i = 0;
			while(scanner1.hasNextInt())
			{
				arr1[i++] = scanner1.nextInt();
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
			
			BubbleSelection obj = new BubbleSelection();
			System.out.println("Selection Sorting");
			for (int o = 0; o < arrs.length; o++)
		    {
					int[] newArr = arrs[o].clone();
		        	start = System.nanoTime();
		        	obj.selectionSort(newArr);
		        	end = System.nanoTime();
		        	time = end - start;
		        	System.out.println((files[o]) + " array" + " execution time: " + time/1000000.0 + " ms");
		    }
			
			System.out.println("\nBubble Sorting");
			for (int o = 0; o < arrs.length; o++)
		    {
					int[] newArr = arrs[o].clone();
		        	start = System.nanoTime();
		        	obj.bubbleSort(newArr);
		        	end = System.nanoTime();
		        	time = end - start;
		        	System.out.println((files[o]) + " array" + " execution time: " + time/1000000.0 + " ms");
		    }
		}
}
