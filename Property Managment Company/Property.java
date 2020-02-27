package Assignment4;

public class Property { //definition of Property class
	private String propertyName;  //to hold the property's name
	private String city;		  //to hold the name of the city where the property is located
	private String owner;		  //to hold the owner's name
	private double rentAmount;	  //to hold the cost of rent of a property
	private Plot plot;			  //to hold a reference to a plot object
	
	public Property() {	//default constructor
	}
	
	public Property(Property propArg) {	//copy constructor
		this(propArg.getPropertyName(),propArg.getCity(),propArg.getRentAmount(), propArg.getOwner()); //calls overloaded constructor
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) { //constructor that accepts 4 arguments
		this(propertyName, city, rentAmount, owner, 0, 0, 0, 0);  //calls overloaded constructor to instantiate a property object with passed values
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) { //8 arg constructor
		this.propertyName = propertyName; //creates instance of a property by using parameter values of the constructor
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	
	public String getCity() { //returns the city name
		return city;
	}
	public void setCity(String city) { //rsets the city's name
		this.city = city;
	}
	
	public String getPropertyName() { //returns the property's name
		return propertyName;
	}
	public void setPropertyName(String propertyName) { //sets the property's name	
		this.propertyName = propertyName;
	}
	
	public double getRentAmount() {  //returns the cost of rent value
		return rentAmount;
	}
	public void setRentAmount(double rentAmount) { //sets the cost of rent amount
		this.rentAmount = rentAmount;
	}
	
	public Plot getPlot() { //returns the plot field reference variable
		return plot;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) { //declares and initializes a plot object
		Plot copyPlot;
		plot = new Plot();
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		copyPlot = new Plot(plot); //calling plot class copy constructor
		return copyPlot;
	}
	
	public String getOwner() { //returns the owner's name
		return owner;
	}
	public void setOwner(String owner) { //sets the owner's name
		this.owner = owner;
	}
	
	public String toString() { //overrides toString method from object class and returns a string containing the field values of the property
		return "Property Name: "+propertyName + "\n Located in " + city + "\n Belonging to: " + owner + "\n Mortgage Amount: " +
		String.format("%.1f", rentAmount);
	}

}
