package PR1_4;
import java.util.*;

public class AreaOfACircle 
{
	final public static double PI = 3.14;
	public static double radius;
	public static double area;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the radius of your circle: ");
		radius = input.nextDouble();
		
		System.out.println("The area of your circle is " + PI * radius * radius + 
				" in whatever units you are using.");
	}
}