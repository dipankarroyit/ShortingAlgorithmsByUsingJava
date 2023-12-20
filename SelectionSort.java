package com.ShortingAlgorithms;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3,7,4,2,5,1,6};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		sort(arr);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
	//sorting logic
	static void sort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min_idx=i;// minimum index of i
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min_idx]) min_idx=j;// minimum index of j
			}
			if(min_idx!=i) swap(arr, min_idx, i);// when index is != i
		}
	}
	// swap logic
	static void swap(int[] a, int m, int n) {
		int temp=a[m];
		a[m]=a[n];
		a[n]=temp;
	}
}
