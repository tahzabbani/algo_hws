
public class ReversedAlgorithms 
{
	private int heapSize;
	public void exchange(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void bubbleSort(int[] arr) //reversed
	{
        for(int i=0; i < arr.length; i++)
        {  
        	for(int j = arr.length - 1; j > i; j--)
            {  
        		if (arr[j] > arr[j - 1])
        		{
        			exchange(arr, j, j - 1);
        		}
            }
        }
	}
	
	public void selectionSort(int[] arr) //reversed
	{
		for (int i = 0; i < arr.length; i++)
		{
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] > arr[min])
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
	public void inSort(int[] arr) //reversed
	{
		int n = arr.length;
		for (int i = 1; i < n; i++)
		{
			int key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] < key)
			{
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}
	
	public void mergesort(int[] arr, int beg, int end) //reversed
	{
		if (beg < end)
		{
			int mid = (beg + end)/2;
			mergesort(arr, beg, mid);
			mergesort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}
	
	public void merge(int[] arr, int beg, int mid, int end)
	{
		int i, j, k;
		int n1 = mid - beg + 1;
		int n2 = end - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (i = 0; i < n1; i++) 
		{
			L[i] = arr[beg + i];
		}
		for (j = 0; j < n2; j++)
		{
			R[j] = arr[mid + 1 + j];
		}
		i = 0;
		j = 0;
		k = beg;
		while (i < n1 && j < n2)
		{
			if (L[i] >= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// for any that might have not been counted
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public void heapify(int arr[], int n, int i) 
    { 
        int smallest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
  
        if (l < n && arr[l] < arr[smallest]) 
            smallest = l; 
  
        if (r < n && arr[r] < arr[smallest]) 
            smallest = r; 
  
        if (smallest != i) { 
            int temp = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = temp; 
  
            heapify(arr, n, smallest); 
        } 
    } 
  
    public void heapSort(int arr[], int n) 
    {  
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  

        for (int i = n - 1; i >= 0; i--) { 
              
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            heapify(arr, i, 0); 
        } 
    }
	public void quickSort(int[] arr, int beg, int end)
	{
		if (beg < end)
		{
			int q = partition(arr, beg, end);
			quickSort(arr, beg, q - 1);
			quickSort(arr, q + 1, end);
		}
	}
	
	public int partition(int[] arr, int beg, int end)
	{
		int x = arr[end];
		int i = beg - 1;
		for (int j = beg; j <= end - 1; j++)
		{
			if (arr[j] >= x)
			{
				i = i + 1;
				exchange(arr, i, j);
			}
		}
		exchange(arr, i + 1, end);
		return (i + 1);
	}
	
	public void novelSorting(int[] arr, int beg, int end)
	{
		int min = beg;
		int max = end;
		if (beg < end)
		{
			for (int i = beg; i <= end; i++)
			{
				if (arr[i] > arr[min])
				{
					min = i;
				}
			}
			exchange(arr, min, beg);
			for (int j = beg; j <= end; j++)
			{
				if (arr[j] < arr[max])
				{
					max = j;
				}
			}
				exchange(arr, max, end);
				novelSorting(arr, beg + 1, end - 1);
		}
	}
}
