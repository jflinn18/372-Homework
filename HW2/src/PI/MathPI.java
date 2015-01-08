package PI;

/**
 * Prints out a table of different accuracies of pi.
 * @author Joseph
 *
 */

public class MathPI {

	public static void main(String[] args)
	{
		String argument = "";
		
		if (args.length > 0)
			argument = args[0];
		
		int times;
		times = Integer.parseInt(argument);

		CalculatePI cp = new CalculatePI();

		
		/**
		 * calls the static method from the CalculatePI class
		 */
		double pi = cp.calcPI(times);
		
		System.out.println("Pi to the " + times + " is " + pi + 
				   "\n");
		/**
		 * Prints out the table of resulting calculations
		 */
		
		for (int i = 1; i <= times; i++)
		{
			pi = cp.calcPI(i);
			System.out.printf("PI to the " + i + " is " + pi 
					  + "\n");
		}

	}
}