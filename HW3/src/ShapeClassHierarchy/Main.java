package ShapeClassHierarchy;

import java.util.Scanner;

public class Main {
	
	private static Scanner _scan;
	/**
	 * Launch the Application
	 * @param args
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args) throws IllegalArgumentException
	{
		_scan = new Scanner(System.in);
		createTriangle();
		createRectangle();
		createEllipse();
		
		_scan.close();
	}
	
	/**
	 * Creates a Triangle from user input
	 * @throws IllegalArgumentException
	 */
	public static void createTriangle() throws IllegalArgumentException
	{
		int [] sides = new int [3];
		try
		{
			for(int i = 0; i < sides.length; i++)
			{
				try
				{
					System.out.print("Enter a side (integer): ");
					sides[i] = _scan.nextInt();
				}
				catch (Exception f)
				{
					System.out.print("That is not an integer");
					_scan.nextLine();
					i--;
				}
			}
				
			Triangle t = new Triangle(sides[0], sides[1], sides[2]);
			
			System.out.println("Area of Triangle is " + t.getArea());
			System.out.println("Perimeter1 of Triangle is " + t.getPerimeter());
		}
		catch (Exception e)
		{
			System.out.println("Error in the creation of the Triangle.");
		}
		
		
		_scan.nextLine();
	}
	
	
	/**
	 * Creates an Ellipse from user input
	 * @throws IllegalArgumentException
	 */
	public static void createEllipse() throws IllegalArgumentException
	{
		int [] rads = new int [2];
		try
		{
			for(int i = 0; i < rads.length; i++)
			{
				try
				{
					System.out.print("Enter a radius (integer): ");
					rads[i] = _scan.nextInt();
				}
				catch (Exception f)
				{
					System.out.print("That is not an integer");
					_scan.nextLine();
					i--;
				}
			}
				
			Ellipse e = new Ellipse(rads[0], rads[1]);
			
			System.out.println("Area of Ellipse is " + e.getArea());
			System.out.println("Perimeter of Ellipse is " + e.getPerimeter());
		}
		catch (Exception e)
		{
			System.out.println("Error in the creation of the Ellipse.");
		}
		
		_scan.nextLine();
	}
	
	
	/**
	 * Creates a rectangle from User Input
	 * @throws IllegalArgumentException
	 */
	public static void createRectangle() throws IllegalArgumentException
	{
		int [] sides = new int [2];
		try
		{
			for(int i = 0; i < sides.length; i++)
			{
				try
				{
					System.out.print("Enter a side (integer): ");
					sides[i] = _scan.nextInt();
				}
				catch (Exception f)
				{
					System.out.print("That is not an integer");
					_scan.nextLine();
					i--;
				}
			}
				
			Rectangle r = new Rectangle(sides[0], sides[1]);
			
			System.out.println("Area of Rectangle is " + r.getArea());
			System.out.println("Perimeter of Rectangle is " + r.getPerimeter());
		}
		catch (Exception e)
		{
			System.out.println("Error in the creation of the Rectangle");
		}
		
		
		_scan.nextLine();
	}

}
