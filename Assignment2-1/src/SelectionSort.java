import java.util.Arrays;

//1. Write a selection sort function to sort array and returns no of 
//comparisions.

public class SelectionSort {

	static int count;

	public static void selectionSort(int arr[], int N) 
	{
		for (int i = 0; i < N-1; i++) 
		{
			for (int j = i+1; j < N; j++) 
			{
				if (arr[i]>arr[j])
				{
					count++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
	int arr[] = {44,11,55,22,66,33}; 
	System.out.println("Array before sort : " + Arrays.toString(arr));
	selectionSort(arr, arr.length);
	System.out.println("Array after sort : " + Arrays.toString(arr));
	System.out.println("No of Comparisions : "+count);
	}

}
