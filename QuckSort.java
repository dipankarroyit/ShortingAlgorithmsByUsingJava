package com.ShortingAlgorithms;
import java.util.Arrays;

public class QuckSort {
	static void sort(int[] a, int start, int end) {
		int i=start, j=end;
		int pivot = a[(start+end)/2];
		while(i<=j) {
			while (a[i]<pivot) i++;
			while (a[j]>pivot) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		if (start<j) sort(a,start,j);
		if (i<end) sort(a,i,end);
	}
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,10,13,1,8};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
}
