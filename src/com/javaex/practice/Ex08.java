package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		int index = -1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 46);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복 존재");
					index = i;
				}
			}
		}
		
		if(index != -1) {
			for(int x = 1; x < 46; x++) {
				for(int e : arr) {
					if(x != e) {
						arr[index] = x;
						break;
					}
				}
				break;
			}		
		}
		
		for(int e : arr) {
			System.out.print(e+"  ");
		}
		
	}
}
