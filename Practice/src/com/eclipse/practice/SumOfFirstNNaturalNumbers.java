package com.eclipse.practice;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The SumOfFirstNNaturalNumbers is " + sum);

	}

}
