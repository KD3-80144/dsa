import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[], int N) {
		int count = 0;
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			//2. compare two consecutive elements
			for(int j = 0 ; j < N - 1 ; j++) {
				count++;
				//3. if left element is greater than right element then swap
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("No of comparisions : " + count);
	}
	
	public static void improvedBubbleSort(int arr[], int N) {
		int count = 0;
		int passes = 0;
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			passes++;
			//2. compare two consecutive elements
			for(int j = 0 ; j < N - i ; j++) {
				count++;
				//3. if left element is greater than right element then swap
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("No of comparisions : " + count);
		System.out.println("No of passes : " + passes);
	}
	public static void main(String[] args) {
		int arr[] = {33, 22, 66, 55, 44, 11};
				//int arr[] = {11, 22, 33, 44, 55, 66};
				System.out.println("Array before sort : " + Arrays.toString(arr));
				//bubbleSort(arr, arr.length);
				improvedBubbleSort(arr, arr.length);
				System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}

