
public class QuickSort 
{
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
			if (arr[j] <= x)
			{
				i = i + 1;
				exchange(arr, i, j);
			}
		}
		exchange(arr, i + 1, end);
		return (i + 1);
	}
	public void quickSortMedian(int[] arr, int beg, int end)
	{
		if (beg < end)
		{
			int n = end - beg + 1;
			int m = median(arr, beg, beg + n/2, end);
			exchange(arr, m, end);
			int q = partition(arr, beg, end);
			quickSortMedian(arr, beg, q - 1);
			quickSortMedian(arr, q + 1, end);
		}
	}
	public int median(int arr[], int i, int j, int k)
	{
		if (arr[i] > arr[j]) {
			  if (arr[j] > arr[k]) {
			    return j;
			  } else if (arr[i] > arr[k]) {
			    return k;
			  } else {
			    return i;
			  }
			} 
		else {
			  if (arr[i] > arr[k]) {
			    return i;
			  } else if (arr[j] > arr[k]) {
			    return k;
			  } else {
			    return j;
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
