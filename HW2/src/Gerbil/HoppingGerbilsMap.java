package Gerbil;
import java.util.*;

/**
 * Uses a Map instead of an Array or ArrayList
 * It also uses a set of the keys and that set's iterator 
 * to make all of the Gerbils hop
 * @author Joseph
 *
 */
public class HoppingGerbilsMap {

	/**
	 * Launch the Application
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		/**
		 * Creates a new HashMap Object
		 */
		HashMap<String, Gerbil> map = new HashMap<String, Gerbil>();
		
		/**
		 * Creates 25 new keys and assigns 25 new Gerbils to each key
		 */
		
		for (int i = 0; i < 25; i++)
		{
			String key = "Gerbil #" + i;
			map.put(key, new Gerbil(i));
		}
		
		/**
		 * Creates a Set and stores a set of the keys from the map in it
		 */
		Set<String> s = map.keySet();
		
		/**
		 * Creates an iterator to iterate through the set of map keys.
		 */
		
		Iterator<String> it = s.iterator();
	
		/**
		 * While the set has another key in the set, get that key's value (Gerbil) and make it hop
		 */
		while (it.hasNext())
			map.get(it.next()).hop();
		
	}
}
