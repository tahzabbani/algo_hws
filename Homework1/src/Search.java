
/*
 * Class for searching utilizing linear search
 * and binary search.
 * @author Tahseen Robbani
 */
public class Search 
{
	/*
	 * Linear search
	 * @return index of answer
	 */
	public int linear(int[] arr, int ans)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == ans)
			{
				return i;
			}
		}
		return -1;
	}
	/*
	 * Binary search.
	 * Use of two methods so that the method can have
	 * have less parameters when called in tester.
	 * @return index of answer
	 */
	public int binary(int[] arr, int ans)
	{
		return binary(arr, ans, 0, arr.length - 1);
	}
	public int binary(int[] arr, int ans, int beg, int end)
	{
		int middle = (beg + end)/2;
		if (ans == arr[middle])
		{
			return middle;
		}
		else if (ans < arr[middle])
		{
			return binary(arr, ans, beg, middle - 1);
		}
		else if (ans > arr[middle])
		{
			return binary(arr, ans, middle + 1, end);
		} 
		return -1;
		
		
	}

}
