package ex2_3;

public class DataOnly {

	// member variables
	public static int i;
	public static float f;
	public static boolean b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new DataOnly object
		DataOnly d = new DataOnly();
		
		// allocation of member variables
		d.i = 47;
		d.f= 1.1f;
		d.b = false;
		
		// prints out the member variables
		System.out.printf("i is %d, f is %f, b is %b", d.i, d.f, d.b);
	}

}
