package Gerbil;
import java.util.*;

/**
 * Uses a for loop to iterate through the array list
 * And I'm using an ArrayList instead of an array
 * @author Joseph
 *
 */
public class HoppingGerbils {

	public static void main(String[] args)
	{
		/**
		 * Using an array list to contain the Gerbil objects
		 */
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		
		/**
		 * Adds 25 Gerbils to the ArrayList
		 */
		for (int i = 0; i < 25; i++)
			gerbils.add(new Gerbil(i));
		
		/**
		 * Prints out all of the Gerbils and calls each of their hopping methods
		 */
		for (int i = 0; i < 25; i++)
		{
			gerbils.get(i).hop();
		}
		
		
	}
}
