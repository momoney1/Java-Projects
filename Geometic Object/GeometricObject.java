package project9;
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

    public abstract class GeometricObject {
	private String color = "white"; //color instance variable initialized to default value of white
	private boolean filled; //boolean instance variable to note whether or not the triangle is filled
	private java.util.Date dateCreated; //declaration of date object
	
	protected GeometricObject () { //protected no arg constructor
		
	}
	protected GeometricObject (String color, boolean filled) { //protected parameterized constructor
		dateCreated = new java.util.Date(); //create date object and assign to date created instance variable
		this.color = color; //initialize color field
		this.filled = filled; //initialize filled field
	}
	
	public String getColor() { //access color variable
		return color;
	}
	
	public void setColor(String color) { //set the color variable value
		this.color = color;
	}
	
	public boolean isFilled() { //access filled variable value
		return filled;
	}
	
	public void setFilled(boolean filled) { //set filled variable value
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated(){ //access date object
		return dateCreated;
	}
	
	@Override
	public String toString() { //implementation of toString method in superclass
		return "created on " + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
	public abstract double getArea(); //abstract accessor method for area
	
	public abstract double getPerimeter(); //abstract accessor method for perimeter
}
