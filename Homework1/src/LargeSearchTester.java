import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class LargeSearchTester 
{
	 private final static int MAX = 1048576; 
	 public static void main(String[] args) throws FileNotFoundException
	 {	
		 try
		 {
			 String str;
			 int key;
			 long start, end;
			 long linear, binary;
			 Random rand = new Random();
			 File file = new File("random.txt");
			 FileWriter fw = null;
			 fw = new FileWriter(file);
			 BufferedWriter writer = new BufferedWriter(fw);
			
			 for(int n = 1000; n > 0; n--)
			 {
				 str = Integer.toString(rand.nextInt(MAX + 1));
				 writer.write(str + "\r\n");
			 }
			 writer.close();
			 BufferedReader br = new BufferedReader(new FileReader(file)); //for reading from file
			 Search obj = new Search();
			 int a[];
			 // create the arrays
			 for (int size = 16; size <= MAX; size *= 2)
			 {
				 a = new int[size];
				 for (int i = 0; i < size; i++)
				 {
					 a[i] = rand.nextInt(size + 1);
				 }
				 
				 start = (System.nanoTime());
				 while ((str = br.readLine()) != null) 
				 {
	                    key = Integer.parseInt(str);
	                    obj.linear(a, key); // performs linear search
				 }
				 end = (System.nanoTime());
				 linear = end - start;
				 
				 start = (System.nanoTime());
				 Arrays.sort(a); // sort the array
				 while ((str = br.readLine()) != null)
				 {
	                    key = Integer.parseInt(str);
	                    obj.binary(a, key); //performs binary search
	                }
				 end = (System.nanoTime());
				 binary = end - start;
				 
				 System.out.println("size: "+ size + "\tlinear time (ms): " + linear/1000000.0 +"\tbinary time (ms): "
						 + binary/1000000.0 + "\n");
				 
			 }
			 br.close();
		 }
		 catch (FileNotFoundException e1) {}
		 catch (IOException e) {
	            e.printStackTrace();
	            System.exit(0);
	        }
		 
	 }
		 
	 
	 
}
