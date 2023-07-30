package com.xworkz.Final.runner;

import com.xworkz.Final.app.Shape;
import com.xworkz.Final.app.Rectangle;
import com.xworkz.Final.app.Square;

public class MultiLevelRunner {

	public static void main(String[] args) {

		Shape shape = new Shape("Generic Shape");
		shape.displayInfo();


		Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
		rectangle.displayInfo();


		Square square = new Square("Square", 4);
		square.displayInfo();
	}
}
