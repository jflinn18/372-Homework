package Cookie_Sales;

/**
 * This keeps track of the total sales that have been done.
 * It also keeps track of how many of one type have been sold
 * @author Joseph
 *
 */
public class CookieSales {
	
	private int _totalSales;
	private int _samoaCount;
	private int _thinMintsCount;
	private int _chocolateChipCount;
	
	/**
	 * Constructor to initialize the member variables
	 */
	public CookieSales()
	{
		_totalSales = 0;
		_samoaCount = 0;
		_thinMintsCount = 0;
		_chocolateChipCount = 0;
	}
	
	/**
	 * Adds the number of types of cookies to their counters
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
	 * Sets the total sales
	 * @param total
	 */
	public void setTotal(int total) { _totalSales += total; }
	/**
	 * Sets the count for Samoa cookies
	 * @param i
	 */
	public void setSamoaCount(int i) { _samoaCount += i; }
	/**
	 * Sets the count for ThinMints cookies
	 * @param i
	 */
	public void setThinMintsCount(int i) { _thinMintsCount += i; }
	/**
	 * Sets the count for ChocoateChip Cookies
	 * @param i
	 */
	public void setChocolateChipCount(int i) { _chocolateChipCount += i; }
	
	
	/**
	 * Get function for the total sales
	 * @return
	 */
	public int getTotal() { return _totalSales; }
	/**
	 * Get function for the samoa cookies count
	 * @return
	 */
	public int getSamoaCount() { return _samoaCount; }
	/**
	 * Get function for thin mints count
	 * @return
	 */
	public int getThinMintsCount() { return _thinMintsCount; }
	/**
	 * Get function for chocolate chip count
	 * @return
	 */
	public int getChocolateCount() { return _chocolateChipCount; }
}
