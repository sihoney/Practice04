package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {
		
		double[] arr = new double[3];
		
		arr[0] = 1.2;
		arr[1] = 3.3;
		arr[2] = 6.7;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
