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

public class Driver { //declaration of test class for triangle class

	public static void main(String[] args) throws Exception { //declaration of possible exception that may be thrown from user input
		Scanner input = new Scanner(System.in); //scanner object to accept user input
		double side1 = 0, side2 = 0, side3 = 0; //double variables to represent triangle sides
		double area = 0, perimeter = 0; //double variables that will contain calculated area and perimeter
		String color = ""; //string variable to contain color value
		String filled = ""; //string variable to inform whether triangle object is filled or not
		boolean isFilled = false, validInput = false; //boolean variables to validate if triangle is filled, and to validate user input
		
		while(validInput == false) { //while loop to validate that a valid number is entered
		try { //try statement containing potential exception causing code
		System.out.print("Enter side 1 of triangle: "); //prompt user to enter a value for triangle side1
		side1 = input.nextDouble();
		validInput = true; //initialize validInput to true to terminate while loop
		} 
		catch (Exception ex) { //catch block for catching exception thrown from code in try statement
			System.out.println("not a valid entry, try again"); //inform user that invalid entry was input
			input.nextLine();
		}
		}
		validInput = false; //initialize validInput to false again, in order to meet while loop condition
		while(validInput == false) { //validation of input for side2 of triangle
		try {
		System.out.print("Enter side 2 of triangle: ");
		side2 = input.nextDouble();
		validInput = true;
		}
		catch(Exception ex) { //catch potential exception
			System.out.println("not a valid entry, try again");
			input.nextLine();
		}
		}
		validInput = false; //initialize to false to meet while loop condition
		while(validInput == false) { //validate user input for side3 of triangle
			try {
			System.out.print("Enter side 3 of triangle: ");
			side3 = input.nextDouble();
			validInput = true; 
			}
			catch(Exception ex) { //catch potential exception
				System.out.println("not a valid entry, try again");
				input.nextLine();
			}
		}
		validInput = false;
		  
		System.out.print("Enter color of triangle: "); //prompt user to enter triangle color
		color = input.next();
		while(color.matches("[a-zA-Z]+") != true) {  //to validate user input for color variable
			  System.out.print("Invalid input, try again: "); 
			  color = input.next();
		}
			
		System.out.print("Enter whether triangle is filled (yes/no): ");
	    filled = input.next();
	    while((filled.equalsIgnoreCase("yes")!= true) && (filled.equalsIgnoreCase("no") != true) ) { //nested loop to validate that user either entered yes or no
			   System.out.print("Enter a valid input (yes/no): ");
			   filled = input.next();
	   }
			
	
		if(filled.equalsIgnoreCase("yes") == true) { //if statement to initialize isFilled to true or false depending on user input
			isFilled = true;
		}
		
		Triangle triangle = new Triangle(side1, side2, side3, color, isFilled); //create an instance of triangle class with sides, colors, and whether or not it's color filled
		area = triangle.getArea(); //to calculate the triangle area and return the value
		perimeter = triangle.getPerimeter(); //to calculate the triangle perimeter and return the value
		
		
		System.out.println("Area: " + area); //display area of triangle
		System.out.println("Perimeter: " + perimeter); //display perimeter of triangle
		System.out.println("Color: " + color); //display color of triangle
		System.out.println("Filled?: " + isFilled); //display true or false if triangle is filled or not

	}

}
