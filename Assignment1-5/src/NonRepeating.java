import java.util.HashMap;
public class NonRepeating {

    public static int findFirstNonRepeating(int arr[]) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element in the array.
        for (int element : arr) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        // Iterate through the array to find the first non-repeating element.
        for (int element : arr) {
            if (countMap.get(element) == 1) {
                return element;
            }
        }

        return -1; // If there is no non-repeating element, return -1.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
        int result = findFirstNonRepeating(arr);

        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
