package Cookie_Sales;

public class CookieSales {
	
	private int _totalSales = 0;
	
	public void addSales(int s, int t, int c)
	{
		setTotal(s * 4);
		setTotal(t * 3);
		setTotal(c * 5);
	}
	
	public void setTotal(int total) { _totalSales += total; }
	public int getTotal() { return _totalSales; }
}
