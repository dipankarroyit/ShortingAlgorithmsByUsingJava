package com.ShortingAlgorithms;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr= {2,5,1,9,4,5};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		sort(arr);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
	static void sort(int[] a) {
		for(int i=1; i<a.length; i++) { // for loop for go forward
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) { // while for right to left
				a[j+1] = a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
}
