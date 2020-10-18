
public class MergeSort 
{
	public void mergesort(int[] arr, int beg, int end, int size)
	{
			if ((end - beg) <= size) // when it becomes small enough, use insertion
			{
				inSort(arr, size);
			}
			else
			{
				int mid = (beg + end)/2;
				mergesort(arr, beg, mid, size);
				mergesort(arr, mid + 1, end, size);
				merge(arr, beg, mid, end);
			}

	}
	public void inSort(int[] arr, int n)
	{
		for (int i = 1; i < n; i++)
		{
			int key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
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
			if (L[i] <= R[j])
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
}
