
public class P5_13 
{
	
	public static void main(String [] args) 
	{
		int n = 0;
		double cubedn = 0;
		while (cubedn < 12000) 
		{  n++; 
		//math.pow is for exponents
		   cubedn = Math.pow(n, 3);
		}
		n--;
		System.out.println("The largest value that is cubed that is less than 12,000 is " + n + ".");
	}
}
