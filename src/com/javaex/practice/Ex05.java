package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목 5개의 점수를 입력하시요");
		
		int[] arr = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		
		sc.close();
		
		double result = (double) sum / 5;
		
		System.out.println("평균은 "+result+" 입니다.");
	}
}
