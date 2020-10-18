
public class HeapSort 
{
	private int heapSize;
	public void heapSort(int[] arr)
	{
		buildMaxHeap(arr);
		for (int i = arr.length - 1; i >= 0; i--) 
		{
			exchange(arr, i, 0);
			heapSize = heapSize - 1;
			maxHeapify(arr, 0);
		}
	}
	public void exchange(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public void buildMaxHeap(int[] arr)
	{
		heapSize = arr.length - 1;
		for (int i = arr.length/2; i >= 0; i--)
		{
			maxHeapify(arr, i);
		}
	}
	public void maxHeapify(int[] arr, int i)
	{
		int largest;
		int l = 2 * i + 1; 
		int r = 2 * i + 2;
		if (l < heapSize && arr[l] > arr[i])
		{
			largest = l;
		}
		else
		{
			largest = i;
		}
	    if (r < heapSize && arr[r] > arr[largest]) 
		{
	        largest = r; 
		}
		if (largest != i)
		{
			exchange(arr, i, largest);
			maxHeapify(arr, largest);
		}
	}
}
