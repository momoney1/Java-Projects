package Assignment4;

public class Plot { //definition of Plot class
	private int x; // holds x coordinate of upper left corner
	private int y; // holds y coordinate of upper left corner
	private int width; // holds width of plot object
	private int depth; // hold depth of plot object
	
	public Plot() { //default constructor
	}
	public Plot(Plot plotArg) { //copy constructor
		this(plotArg.getX(), plotArg.getY(), plotArg.getWidth(), plotArg.getDepth()); //calls the overloaded constructor and passes in value from plotArg
	}
	public Plot(int x, int y, int width, int depth) { // 4 arg constructor that creates plot instance by using parameter values
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public boolean overlaps (Plot plot) { //method that checks if any two plot locations overlap
		
		if(x <plot.getX() && plot.getX()< x + width && y + depth <plot.getY() && plot.getY()< y)
			return true;
		  
		 if(x < plot.getX() + plot.getWidth() && plot.getX() + plot.getWidth()  < x + width && y + depth < plot.getY() && plot.getY() < y)
			 return true;
		 
		 if(x < plot.getX() + plot.getWidth()  && plot.getX() + plot.getWidth() < x + width && y + depth < plot.getY() + plot.getDepth())
			 return true;
		 
		 if(x <plot.getX() && plot.getX() < x + width && y + depth < plot.getY() + plot.getDepth() && plot.getY() + plot.getDepth() < y)
			 return true;
		 
		 return false;
		
		}
	
	  public boolean encompasses(Plot plot) //method that checks to see if two plot instances encompass one another
       {
             if(plot.getX() >= x && plot.getX() <= x + width)
            	 if(plot.getY() >= y && plot.getY() <= y + depth)
            		 if(plot.getX() + plot.getWidth() >= x && plot.getX() + plot.getWidth() <= x + width)
            			 if(plot.getY() + plot.getDepth() >= y && plot.getY() + plot.getDepth() <= y + depth)
            				 return true;
             return false;
       }
	
	public int getX() { //returns x coordinate
		return x;
	}
	public void setX(int x) { //sets x coordinate
		this.x = x;
	}
	public int getY() { //returns y coordinate
		return y;
	}
	public void setY(int y) { // sets y coordinate
		this.y = y;
	}
	public int getWidth() { //returns width
		return width;
	}
	public void setWidth(int width) { //sets width
		this.width = width;
	}
	public int getDepth() { //returns depth
		return depth;
	}
	public void setDepth(int depth) { //sets depth
		this.depth = depth;
	}
	public String toString() { //overrides object class toString method, returns string representation of plot object fields
		return "Upper left: (" + x + ","+ y + "); Width: "+ width + " Depth: "+ depth;
	}

}
