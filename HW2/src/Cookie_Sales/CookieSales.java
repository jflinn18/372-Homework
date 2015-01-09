package Cookie_Sales;

/**
 * This keeps track of the total sales that have been done.
 * It also keeps track of how many of one type have been sold
 * @author Joseph
 *
 */
public class CookieSales {
	
	private int _totalSales = 0;
	private int _samoaCount = 0;
	private int _thinMintsCount = 0;
	private int _chocolateChipCount = 0;
	
	/**
	 * Adds the number of types of cookies to thier counters
	 * Adds the right amount of money to the total sales from all cookies
	 * @param s
	 * @param t
	 * @param c
	 */
	public void addSales(int s, int t, int c)
	{
		setTotal(s * 4);
		setTotal(t * 3);
		setTotal(c * 5);
		
		setSamoaCount(s);
		setThinMintsCount(t);
		setChocolateChipCount(c);
	}
	
	/**
	 * Set functions for all member variables
	 */
	
	public void setTotal(int total) { _totalSales += total; }
	public void setSamoaCount(int i) { _samoaCount += i; }
	public void setThinMintsCount(int i) { _thinMintsCount += i; }
	public void setChocolateChipCount(int i) { _chocolateChipCount += i; }
	
	/**
	 * Get functions for all member variables
	 */
	
	public int getTotal() { return _totalSales; }
	public int getSamoaCount() { return _samoaCount; }
	public int getThinMintsCount() { return _thinMintsCount; }
	public int getChocolateCount() { return _chocolateChipCount; }
}
