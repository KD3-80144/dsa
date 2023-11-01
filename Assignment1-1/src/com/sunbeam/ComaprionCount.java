//1. Write a program to print no of comparisions done to search a key in
//	i. linear search
//	ii. binary serach

package com.sunbeam;

import java.util.Scanner;

public class ComaprionCount {

	static int count;
	static int count1;

	
	public static int linear_search(int arr[], int size, int key) {
		for (int i = 0; i < size; i++) {
			count++;
			if (arr[i] == key)
				return i;

		}
		return -1;
	}
	
	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			count1++;
			mid = (right + left) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;

	}
	
	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		int index = linear_search(arr, arr.length, key);
		if (index != -1) 
			System.out.println("Key is found at Index: " +index);		
		else 
			System.out.println("Key is not found");		
	System.out.println("Count of comparisions in linear search: "+count);
		
		
		int index1 = binarySearch(arr, arr.length, key);
		if (index != -1) 
			System.out.println("Key is found at Index: " +index1);		
		else 
			System.out.println("Key is not found");		
		System.out.println("Count of comparisions in binary search: "+count1);
		
		sc.close();
			


			}

		}

		
	