package com.eclipse.practice;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is Odd");
		}

	}

}
