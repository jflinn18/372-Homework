package Cookie_Sales;

public class Cookies {

	protected String _name;
	protected int _price;
	
	public Cookies(String name)
	{
		setName(name);
		
		if (name == "Samoa")
			setPrice(4);
		else if (name == "Thin Mints")
			setPrice(3);
		else
			setPrice(5);
	}
	
	public int getPrice() { return _price; }
	public String getName() { return _name; }
	
	public void setName(String name) { _name = name; }
	public void setPrice(int price) { _price = price; }
}
