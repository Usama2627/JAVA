package com.eclipse.practice;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("The name is " + name);

		Scanner sc1 = new Scanner(System.in);
		String name1 = sc1.nextLine();
		System.out.println("The name is " + name1);

		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt();
		System.out.println("The age is " + age);

		// nextFloat()

	}

}
