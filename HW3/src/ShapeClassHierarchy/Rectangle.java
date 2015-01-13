package ShapeClassHierarchy;

public class Rectangle extends Shape{
	
	private double _width;
	private double _height;
	
	
	/**
	 * Rectangle Constructor
	 * @param width
	 * @param height
	 * @throws IllegalArgumentException
	 */
	public Rectangle(int width, int height) throws IllegalArgumentException
	{
		if (width == 0 || height == 0)
			throw new IllegalArgumentException("This is not a rectangle");
		
		_width = width;
		_height = height;
	}
	
	/**
	 * Calculates the area of the rectangle
	 */
	@Override
	public double getArea() { return _width * _height; }
	/**
	 * Calculates the perimeter of the rectangle
	 */
	@Override
	public double getPerimeter() { return 2 * _width + 2 * _height; }
	
	
}
