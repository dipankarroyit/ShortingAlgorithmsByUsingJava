package com.ShortingAlgorithms;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {9,4,5,2,3,7,1,8};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		sort(arr);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
	// merge code
	static void merge(int[] a,int[] b,int[] c) {
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
	}
	// sorting code
	static void sort(int[] arr) {
		if(arr.length==1) return;
		int[] l=new int[arr.length/2];
		int[] r=new int[arr.length-l.length];
		int i=0;
		while(i<l.length) {
			l[i]=arr[i];
			i++;
		}
		int j=0;
		while(j<r.length) {
			r[j]=arr[i];
			j++;
			i++;
		}
		sort(l);
		sort(r);
		merge(l, r, arr);
	}
}