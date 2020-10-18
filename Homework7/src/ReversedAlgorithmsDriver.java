import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReversedAlgorithmsDriver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		 long start, end, time;
		 Scanner scanner = new Scanner(new File("input_100.txt"));
		 Scanner scanner2 = new Scanner(new File("input_1000 (1).txt"));
		 Scanner scanner3 = new Scanner(new File("input_5000 (1).txt"));
		 Scanner scanner4 = new Scanner(new File("input_10000.txt"));
		 Scanner scanner5 = new Scanner(new File("input_50000 (1).txt"));
		 
		 int [] arr = new int [100];
		 int [] arr2 = new int [1000];
	     int [] arr3 = new int [5000];
	     int [] arr4 = new int [10000];
         int [] arr5 = new int [50000];
         
         int [][] arrs = {arr, arr2, arr3, arr4, arr5};
         
		 int i = 0;
         while(scanner.hasNextInt())
         {
            arr[i++] = scanner.nextInt();
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
         int i4 = 0;
         while(scanner4.hasNextInt())
         {
            arr4[i4++] = scanner4.nextInt();
         }
         int i5 = 0;
         while(scanner5.hasNextInt())
         {
            arr5[i5++] = scanner5.nextInt();
         }
		ReversedAlgorithms obj = new ReversedAlgorithms();
		
		System.out.println("Bubble Sort");
		for (int o = 0; o < arrs.length; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.bubbleSort(newArr);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
		
		System.out.println("\nSelection Sort");
		for (int o = 0; o < arrs.length; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.selectionSort(newArr);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
		
		System.out.println("\nInsertion Sort");
		for (int o = 0; o < arrs.length; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.inSort(newArr);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
		
		System.out.println("\nMerge Sort");
		for (int o = 0; o < arrs.length; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.mergesort(newArr, 0, newArr.length - 1);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
		
		System.out.println("\nHeap Sort");
		for (int o = 0; o < arrs.length; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.heapSort(newArr, newArr.length - 1);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
		
		System.out.println("\nQuick Sort");
		for (int o = 0; o < arrs.length; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.quickSort(newArr, 0, newArr.length - 1);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
		
		System.out.println("\nNovel Sort");
		for (int o = 0; o < arrs.length - 1; o++)
        {
			int[] newArr = arrs[o].clone();
        	start = System.nanoTime();
        	obj.novelSorting(newArr, 0, newArr.length - 1);
        	end = System.nanoTime();
        	time = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + time/1000000.0 + " ms");
        }
	}

}
