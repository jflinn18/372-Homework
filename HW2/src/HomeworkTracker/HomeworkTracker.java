package HomeworkTracker;

import java.util.*;

/**
 * Calculates the min, max and average of the the array list. 
 * It uses an Iterator to go through the array list
 * @author Joseph
 *
 */
public class HomeworkTracker {

	public List<Double> list = new ArrayList<Double>();
	public Iterator<Double> e;
	
	/**
	 * Calculates the minimum value in the ArrayList
	 * @return
	 */
	public double calcMin()
	{
		e = list.iterator();
		double min = list.get(0);
		double d;
		
		while(e.hasNext())
		{
			d = e.next();
			
			if (list.size() == 1)
				return d;
			else
				if (min > d)
					min = d;
		}
		
		return min;
	}
	
	/**
	 * Calculates the maximum value of the ArrayList
	 * @return
	 */
	public double calcMax()
	{
		e = list.iterator();
		double max = 0;
		double d;
		
		while (e.hasNext())
		{
			d = e.next();
			if(max < d)
				max = d;
		}
		
		return max;
	}
	
	/**
	 * Calculates the Average of the ArrayList
	 * @return
	 */
	public double calcAve()
	{
		e = list.iterator();
		double ave = 0;
		double sum = 0;
		
		while(e.hasNext())
		{
			sum += e.next();
			ave = sum/list.size();
		}
			
		return ave;
	}
	
	/**
	 * Adds a value to the ArrayList
	 * @param d
	 */
	public void addScore(double d)
	{
		list.add(d);
	}
}
