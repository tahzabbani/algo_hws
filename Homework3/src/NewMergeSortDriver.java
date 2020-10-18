import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewMergeSortDriver 
{
	public static void main(String args[]) throws FileNotFoundException 
    {         
		long start, end;
		long insertTime;
		Scanner scanner = new Scanner(new File("input_100.txt"));
		Scanner scanner2 = new Scanner(new File("input_1000.txt"));
		Scanner scanner3 = new Scanner(new File("input_5000.txt"));
		Scanner scanner4 = new Scanner(new File("input_10000.txt"));
		Scanner scanner5 = new Scanner(new File("input_50000.txt"));
		Scanner scanner6 = new Scanner(new File("input_100000.txt"));
		Scanner scanner7 = new Scanner(new File("input_500000.txt"));
        
        int [] arr = new int [100];
        int [] arr2 = new int [1000];
        int [] arr3 = new int [5000];
        int [] arr4 = new int [10000];
        int [] arr5 = new int [50000];
        int [] arr6 = new int [100000];
        int [] arr7 = new int [500000];
        
        int [][] arrs = {arr, arr2, arr3, arr4, arr5, arr6, arr7}; //array of the 7 arrays
        
        // all individually scanned in
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
        int i6 = 0;
        while(scanner6.hasNextInt())
        {
           arr6[i6++] = scanner6.nextInt();
        }
        int i7 = 0;
        while(scanner7.hasNextInt())
        {
           arr7[i7++] = scanner7.nextInt();
        }
        MergeSortInitial obj = new MergeSortInitial();         
        // loop for recording the time and calling sorts
        System.out.println("Merge Sort");
        for (int o = 0; o < arrs.length; o++)
        {
        	start = System.nanoTime();
        	obj.mergesort(arrs[o], 0, arrs[o].length - 1);
        	end = System.nanoTime();
        	insertTime = end - start;
        	System.out.println("array " + (arrs[o].length) + " execution time: " + insertTime/1000000.0 + " ms");
        }
    }
}
