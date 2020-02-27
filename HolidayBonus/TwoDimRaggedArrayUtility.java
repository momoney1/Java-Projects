package Assignment5;
import java.util.Scanner;
import java.io.*;

/**
 * A class named TwoDimRaggedArrayUtility contains multiple methods whose purpose is to
 * traverse two dimensional ragged arrays in order to select or calculate values
 * @author Moe Diakite
 *
 */
public final class TwoDimRaggedArrayUtility {
	/**
	 * no arg constructor
	 */
    TwoDimRaggedArrayUtility(){
	}
    
    /**
     * A method that returns the average of the total of all the values in the array
     * @param data
     * @return average
     */
    public static double getAverage(double[][] data) {
    	double average = 0, total = 0, count = 0;
    	for(int i = 0; i < data.length; i++) {
    		for(int j = 0; j < data[i].length; j++, count++) {
    			total += data[i][j];
    		}
    	}
    	average = total/count;
    	return average;
    }
    
    /**
     * A method that returns the total of the column that is passed as an argument
     * @param data
     * @param col
     * @return total
     */
    public static double getColumnTotal(double[][] data, int col) {
    	double total = 0;
    	for(int i = 0; i < data.length; i++) { 
    		
    		if(data[i].length - 1 < col) {
    			continue;
    		}
    		else {
    			total += data[i][col];
    		}
    	}
    	return total;
    }
    
    /**
     * A method that returns the highest value in the entire array
     * @param data
     * @return max
     */
    public static double getHighestInArray(double[][] data) {
    	double max = data[0][0];
    	for(int i = 0; i < data.length; i++) {
    		for(int j = 0; j < data[i].length; j++) {
    			if(max < data[i][j]) {
    				max = data[i][j];
    			}
    		}
    	}
    	return max;
    }
    
    /**
     * A method that returns the lowest value in the array
     * @param data
     * @return min
     */
    public static double getLowestInArray(double[][] data) {
    	double min = data[0][0];
    	for(int i = 0; i < data.length; i++) { 
    		for(int j = 0; j < data[i].length; j++) {
    			if(min > data[i][j]) {
    				min = data[i][j];
    			}
    		}
    	}
    	return min;
    }
    
    /**
     * A method that returns the highest value in the column that is passed as an argument
     * @param data
     * @param col
     * @return max
     */
    public static double getHighestInColumn(double[][] data, int col) {
    	double max = 0; 
    	for(int i = 0; i < data.length; i++) {
    		if(data[i].length - 1 < col) {
    			continue;
    		}
    		if(max < data[i][col]) {
    			max = data[i][col];
    		}
    	}
    	return max;
    }
    
    /**
     * A method that returns the index of the highest value in the column that is passed as an argument
     * @param data
     * @param col
     * @return highest
     */
    public static int getHighestInColumnIndex(double[][] data, int col) {
    	int highest = 0;
    	double max = 0;
    	for(int i = 0; i < data.length; i++) {
    		if(data[i].length - 1 < col)
    			continue;
    		
    		if(max < data[i][col]) {
    			max = data[i][col];
    			highest = i;
    		}
    	}
    	return highest;
    }
    
    /**
     * A method that returns the highest value in the row argument
     * @param data
     * @param row
     * @return max
     */
    public static double getHighestInRow(double[][] data, int row) {
    	double max = 0;
    	for(int i = 0; i < data[row].length; i++) {
    		if(data[row][i] > max) {
    			max = data[row][i];
    		}
    	}
    	return max;
    }
    
    /**
     * A method that returns the index of the highest value in the row argment
     * @param data
     * @param row
     * @return index
     */
    public static int getHighestInRowIndex(double[][] data, int row) {
    	double max = 0;
    	int index = 0;
    	for(int i = 0; i < data[row].length; i++) {
    		if(data[row][i] > max) {
    			max = data[row][i];
    			index = i;
    		}
    	}
    	return index;
    }
    
    /**
     * A method that returns the lowest value in the column number that is passed as argument
     * @param data
     * @param col
     * @return min
     */
    public static double getLowestInColumn(double[][] data, int col) {
    	double min = 0;
    	for(int i = 0; i < data.length; i++) {
    		min = 0;
    		if(data[i].length > col) {
    			min = data[i][col];
    			for(int e = i; e < data.length; e++) {
    				if(data[e].length > col)
    				if(min > data[e][col]) {
    					min = data[e][col];
    				}
    			}
    			return min;
    	  }
      }	
    	return min;
    }
    
    public static int getLowestInColumnIndex(double[][] data, int col) {
    	double min = 0;
    	int column = 0;
    	min = getLowestInColumn(data, col);
    	for(int i = 0; i < data.length; i++) {
    		if(data[i].length > col) {
    			if(min >= data[i][col]) {
        			min = data[i][col];
        			column = i;
        		}
    		}
    		
    	}
    	return column;
    }
    
    /**
     * A method that returns the lowest value in the row number that is passed as argument
     * @param data
     * @param row
     * @return min
     */
    public static double getLowestInRow(double[][] data, int row) {
    	double min = data[row][0];
    	for(int i = 1; i < data[row].length; i++) {
    		if(min > data[row][i]) {
    			min = data[row][i];
    		}
    	}
    	return min;
    }
    
    /**
     * A method that returns the index of the lowest value in the row number that is passed as argument
     * @param data
     * @param row
     * @return lowIndex
     */
    public static int getLowestInRowIndex(double[][] data, int row) {
    	double min = data[row][0];
    	int lowIndex = 0;
    	for(int i = 0; i < data[row].length; i++) {
    		if(min >= data[row][i]) {
    			min = data[row][i];
    			lowIndex = i;
    		}
    	}
    	return lowIndex;
    }
    
    /**
     * A method that returns the total of the row number that is passed as an argument
     * @param data
     * @param row
     * @return total
     */
    public static double getRowTotal(double[][] data, int row) {
    	double total = 0;
    	for(int i = 0; i < data[row].length; i++) {
    		total += data[row][i];
    	}
    	return total;
    }
    
    /**
     * A method that returns the total of all the values contained in the two dimentional array
     * @param data
     * @return total
     */
    public static double getTotal(double[][] data) {
    	double total = 0;
    	for(int i = 0; i < data.length; i++) {
    		for(int j = 0; j < data[i].length; j++) {
    			total += data[i][j];
    		}
    	}
    	return total;
    }
    
    /**
     * A method that reads from a file and returns all the values in the file in the form of a two dimensional array
     * @param file
     * @return [][]myArray
     * @throws Exception
     */
    public static double[][] readFile(java.io.File file) throws Exception {
    	Scanner sc = new Scanner(file);
    	
    	String[] lineArray;
    	String line = "";
    	int rows = 0, totalRows = 0, columns = 0, maxRows = 10, maxColumns = 10;
    	double[][] myArray;
    	while(sc.hasNext() && totalRows < maxRows) {
    		System.out.println(sc.nextLine() + " ");
    		totalRows++;
    	}
    	sc.close();
    	sc = new Scanner(file);
    	myArray = new double[totalRows][];
    	while(sc.hasNext() && rows < totalRows) {
    		line = sc.nextLine();
    		lineArray = line.split(" ");
    		columns = lineArray.length;
    		myArray[rows] = new double[columns];
    		for(int i = 0; i < columns; i++) {
    			myArray[rows][i] = Double.parseDouble(lineArray[i]);
    		}
    		rows++;
    	}
    	sc.close(); 
    	return myArray;
    	
    }
    
    /**
     * A method that writes all the values from the passed array data into a file
     * @param data
     * @param outputFile
     * @throws Exception
     */
    public static void writeToFile(double[][] data, java.io.File outputFile) throws Exception {	
    	PrintWriter out = new PrintWriter(outputFile);
    	for(int i = 0; i < data.length; i++) {
    		for(int j = 0; j < data[i].length; j++) {
    			if(j == data[i].length - 1)
    				out.println(data[i][j]);
    			else
    			out.print(data[i][j] + " ");
    		}
    	}
    	out.close();
    }
}
