package com.ShortingAlgorithms;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {2,5,1,9,4,5};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		sort(arr);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
	// sort method
	public static void sort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			boolean swapped = false; // for more optimization
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					swapped = true; // for more optimization
					swap(a, j, j+1);
				}
			}
			if(!swapped) break; // for more optimization
		}
	}
	// swap method
	static void swap(int[] arr, int m, int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
}
