package com.tka.may4;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 6, 5};
		int min = a[0];
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min)
				min = a[i];
			
			if(a[i] > max)
				max = a[i];
		}
		System.out.println("sum: " + (min+max));

	}

}
