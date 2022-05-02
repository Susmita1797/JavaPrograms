package BasicPrograms;

public class PeakAndTroughElementsInArray {

	//An element A[i] of an array A is a peak element if it’s not smaller than its neighbor(s).
	//A trough element is an element that is smaller than its neighbouring elements.
	//	Input: arr[] = {5, 10, 5, 7, 4, 3, 5} 
	//	Output: 
	//	Peaks : 10 7 5 
	//	Troughs : 5 5 3
	//	Input: arr[] = {1, 2, 3, 4, 5} 
	//	Output: 
	//	Peaks : 5 
	//	Troughs : 1  

	// Function that returns true if num is greater than both arr[i] and arr[j]

	public static boolean isPeak(int arr[], int n, int num, int i, int j)
	{
		// If num is smaller than the element on the left (if exists)
		if (i > 0 && arr[i] > num)
		{
			return false;
		}
		// If num is smaller than the element on the right (if exists)
		if (j < n && arr[j] > num)
		{
			return false;
		}
		return true;
	}

	// Function that returns true if num is smaller than both arr[i] and arr[j]
	public static boolean isTrough(int arr[], int n, int num, int i, int j)
	{
		// If num is greater than the element on the left (if exists)
		if (i > 0 && arr[i] < num)
		{
			return false;
		}
		// If num is greater than the element on the right (if exists)
		if (j < n && arr[j] < num)
		{
			return false;
		}
		return true;
	}

	public static void printPeaksTroughs(int arr[], int n)
	{
		System.out.print("Peaks : ");

		// For every element
		for (int i = 0; i < n; i++)
		{

			// If the current element is a peak
			if (isPeak(arr, n, arr[i], i - 1, i + 1))
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");

		System.out.print("Troughs : ");

		// For every element
		for (int i = 0; i < n; i++)
		{

			// If the current element is a trough
			if (isTrough(arr, n, arr[i], i - 1, i + 1))
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = {5, 10, 5, 7, 4, 3, 5};
		int n = arr.length;

		printPeaksTroughs(arr, n);
	}
}