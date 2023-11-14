package com.eclipse.practice;

public class CountTheCharacterInString {
	public static void main(String[] args) {

		String x = "My Name is Usama";
		int count = 0;

		for (int i = 0; i < x.length(); i++) {
			count++;
		}
		System.out.println("The Characters in String are : " + count);
	}

}

//           < without spaces with if condition >

//public class CountTheCharacterInString {
//	public static void main(String[] args) {
//
//		String x = "My Name is Usama";
//		int count = 0;
//
//		for (int i = 0; i < x.length(); i++) {
//			if (x.charAt(i) !=' ')
//				count++;
//		}
//		System.out.println("The Characters in String are : " +count);
//	}
//
//}
