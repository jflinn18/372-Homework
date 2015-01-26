package ShapeClassHierarchy;

public class Triangle extends Shape{
	
	private double _side1;
	private double _side2;
	private double _side3;

	/**
	 * Triangle Constructor
	 * @param s1
	 * @param s2
	 * @param s3
	 * @throws IllegalArgumentException
	 */
	public Triangle(int s1, int s2, int s3) throws IllegalArgumentException
	{
		//PT -- also need to check for <= 0
		if (s1+s2 <= s3 || s1+s3 <= s2 || s2+s3 <= s1)
			throw new IllegalArgumentException("This is not a triangle.");
		
		_side1 = s1;
		_side2 = s2;
		_side3 = s3;
	}
	
	/**
	 * Calculates the Area of the triangle
	 */
	@Override
	public double getArea() 
	{
		double s = ( _side1 + _side2 + _side3 ) / 2;
		return  Math.sqrt(s * (s-_side1) * (s-_side2) * (s-_side3));
	}
	/**
	 * Calculates the perimeter of the triangle
	 */
	@Override
	public double getPerimeter() { return _side1 + _side2 + _side3; }
}
