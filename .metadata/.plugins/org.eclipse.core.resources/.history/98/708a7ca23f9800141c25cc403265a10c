package Gerbil;
import java.util.*;

/**
 * Uses an iterator instead of a for loop
 * @author Joseph
 *
 */
public class HoppingGerbils2 {

	public static void main(String[] args)
	{
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		
		for(int i = 0; i < 25; i++) { gerbils.add(new Gerbil(i)); }
		
		Iterator<Gerbil> e = gerbils.iterator();
		
		while(e.hasNext())
		{
			(e.next()).hop();
		}
	}
}
