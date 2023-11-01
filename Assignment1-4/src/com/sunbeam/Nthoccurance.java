package com.sunbeam;

import java.util.Scanner;

public class Nthoccurance {

	public static int NthOccurrence(int arr[], int size, int key, int n) {
		int count = 0; // Initialize a count to track occurrences.

		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				count++; // Increment count when the key is found.

				if (count == n) {
					return i; // Return the index if the nth occurrence is found.
				}
			}
		}

		return -1; // Return -1 if the nth occurrence is not found.
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 11, 33, 44, 11, 55, 66, 22, 11, 77, 88, 33, 99, 22 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();

		System.out.println("Enter the no of occurances");
		int n = sc.nextInt();
		// int n = 3; // Find the 3rd occurrence of key.

		int index = NthOccurrence(arr, arr.length, key, n);

		if (index != -1) {
			System.out.println("The " + n + " occurrence of " + key + " is found at index: " + index);
		} else {
			System.out.println("The " + n + " occurrence of " + key + " is not found.");
		}
	}
}
