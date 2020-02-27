package Assignment5;
import Assignment5.TwoDimRaggedArrayUtility;

/**
 * A class containing two methods who's purpose is to calculate the holiday bonuses for list of stores and 
 * also the total of all the bonuses from the list of stores
 * @author Moe Diakite
 *
 */
public class HolidayBonus {
	private static double total; 
	public HolidayBonus(){
	}
	
	/**
	 * A method that use retrieves values from a two dimensional array in order to calculate bonuses for each store
	 * and returns all the values as an array
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonusArray
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		total = 0; //initialize total back to zero every time this method is invoked
		double[] bonusArray = new double[data.length];
		int numOfColumns = 0;
		if(data.length > 0)
	       numOfColumns = data[0].length;
		int highest = 0, lowest = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > numOfColumns)
				numOfColumns = data[i].length;
		}
		
			for(int j = 0; j < numOfColumns; j++) {
				highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j);
				if(data[highest][j] > 0) {
				bonusArray[highest] += high; 
				total += high;
				}
				lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
				if(data[lowest].length > j) {
				if(data[lowest][j] > 0) {
				bonusArray[lowest] += low;
				total += low;
				
				}
				else if(data[lowest][j] <= 0) {
					bonusArray[lowest] += 0;
				}
				}
				for(int a = 0; a < bonusArray.length; a++) {
					if(a == highest || a == lowest || data[a].length - 1 < j) {
						continue;
					}
					else {
						bonusArray[a] += other;
						total += other;
					}
				}
			}
		
		return bonusArray;
	}
	
	/**
	 * A method that totals up all the bonuses from each store and returns the total value
	 * This method uses the calling of the "calculateHolidayBonus" method in order to property initialize
	 * the value of "total".
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return total
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		calculateHolidayBonus(data, high, low, other); //method invoked simply to properly initialize total variable
		return total;
	}
}
