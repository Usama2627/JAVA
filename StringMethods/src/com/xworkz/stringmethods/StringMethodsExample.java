package com.xworkz.stringmethods;

public class StringMethodsExample {

	public static void main(String[] args) {

		String animal = "The quick brown fox jumps over the lazy dog.";

		System.out.println(animal.charAt(15)); 

		System.out.println(animal.concat(" They both live in the forest.")); 

		System.out.println(animal.substring(10)); 

		System.out.println(animal.substring(16, 20)); 

		System.out.println(animal.indexOf("fox")); 
		System.out.println(animal.indexOf("dog", 25)); 

		String animal2 = "The sly fox jumps over the sleeping dog.";
		String parts[] = animal.split("brown");
		for (String part : parts) {
			System.out.print(part); 
		}
		System.out.println();

		System.out.println(animal.equalsIgnoreCase(animal2)); 

		System.out.println(animal.equals(animal2)); 

		String animal3 = "The clever fox jumps over the drowsy dog.";

		System.out.println(animal.compareTo(animal2)); 

		System.out.println(animal.compareToIgnoreCase(animal3)); 

		String name = "wild animals";
		char n[] = name.toCharArray();
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		System.out.println(name.toUpperCase()); 

		System.out.println(name.isEmpty()); 

		System.out.println(name.length()); 

		System.out.println(name.startsWith("w"));

		System.out.println(name.replace('i', 'o'));

		System.out.println(animal2.replaceAll("sly", "smart")); 

	}

}
