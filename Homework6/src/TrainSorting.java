
public class TrainSorting 
{
	// using insertion sort modified for strings
	public void sortNames(String[] arr)
	{
		int n = arr.length;
		for (int i = 1; i < n; i++)
		{
			String key = arr[i];
			int j = i -1;
			while (j >= 0 && (arr[j].compareTo(key) > 0))
			{
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}
}