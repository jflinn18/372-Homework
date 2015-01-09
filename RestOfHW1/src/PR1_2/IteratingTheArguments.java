package PR1_2;

/**
 * Prints out three arguments from the command line
 * @author Joseph
 *
 */
public class IteratingTheArguments {
	//PT: need javadocs for main. -3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This will iterate through three arguments taken from the command line.
		 * If there isn't any arguments in the array, it will throw an exception.
		 */
		 //PT: Good to check that there are at least three arguments
		 // for (int i=0; i<3 && args.length >= 3; i++)
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Args[" + i + "] is " + args[i]);
		}
	}

}
