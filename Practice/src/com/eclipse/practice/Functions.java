package com.eclipse.practice;

import java.util.Scanner;

public class Functions {

	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = calculateSum(a, b);
		System.out.println("The sum is : " + calculateSum(a, b));
	}
}

//public class Functions {
//
//	public static int calculateProduct(int a, int b) {
//		return a * b;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("The Product is : "+calculateProduct(a, b));
//	}
//}
