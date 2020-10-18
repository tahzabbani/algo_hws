
public class BubbleSelection 
{
	public void bubbleSort(int[] arr)
	{
        for(int i=0; i < arr.length; i++)
        {  
        	for(int j = arr.length - 1; j > i; j--)
            {  
        		if (arr[j] < arr[j - 1])
        		{
        			exchange(arr, j, j - 1);
        		}
            }
        }
 
	}
	public void selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
				}
			}
			if (i != min)
			{
				exchange(arr, min, i);
			}
		}
	}
	public void exchange(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
