package project9;
import java.util.Scanner;
/* 
* Class: CMSC201 
* Instructor:  Prof Grinberg 
* Description: Purpose of program is to create a triangle class and a test class that prompts the user
* to enter values for the sides, color, and whether or not the triangle is filled. Then display the area and perimeter
* based on the values entered by the user. 
* Due: 04/20/2019 
* I pledge that I have completed the programming assignment independently. 
  I have not copied the code from a student or any source. 
  I have not given my code to any student. 
  Print your name here: Mohamed Diakite 
*/
public class Triangle extends GeometricObject { //declare triangle class as a subclass of GeometricObject class
	private double side1, side2, side3; //declare double instance variables to contain value of triangle sides
	
	public Triangle() { //triangle no arg constructor
		this(1.0, 1.0, 1.0, "white", false); //default values for triangle object
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {//parameterized constructor
		super(color, filled); //invoke superclass constructor with string and boolean values passed
		this.side1 = side1; //initialize instance variables with argument values
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() { //to access side1
		return side1;
	}
	public double getSide2() { //to access side2
		return side2;
	}
	public double getSide3() { //to access side3
		return side3;
	}

	public double getArea() { //using heron's formula to access and calculate area
	   double s = (side1 + side2 + side3)/2; 
	   double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area; 
	}
	
	public double getPerimeter() { //to access perimeter instance variable
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
}

