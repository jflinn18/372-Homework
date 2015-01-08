package Gerbil;

/**
 * The Gerbil class that includes the gerbil number and a hopping function 
 * that makes the gerbil hop.
 * @author Joseph
 *
 */

public class Gerbil {

	/**
	 * Member variables
	 */
	public int gerbilNumber;
	
	/**
	 * Constructor for the Gerbil class
	 * allocates the number to the Gerbil
	 * @param i
	 */
	
	public Gerbil(int i){gerbilNumber = i + 1;}
	
	public int getGNum(){return gerbilNumber;}
	
	/**
	 * Prints which Gerbil is hopping
	 */
	
	public void hop()
	{
		System.out.printf("This is gerbil #%d\nGerbil #%d is hopping!\n\n", getGNum(), getGNum());
	}
}