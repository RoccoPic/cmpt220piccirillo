import java.text.NumberFormat;
public class P6_13 {
	public static void main(String args[]) {
		//controls how many decimal points
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(4);
		decimal.setMinimumFractionDigits(4);
		
		System.out.println("i\t\tm(i)");
		System.out.println("--------------------------");
		
		String conversionOut ="";
		double total = 0;
		
		for (int i = 1; i <=20; i++) {
			
		
			System.out.print(i + "\t\t");
			total = compute(i, total);
			System.out.print(decimal.format(total) + "\n");
				
		}
	
	}
	public static double compute(double i, double total) {
		 total = total + (i/(i+1));
		 //System.out.println(total);
		 return total;
		 
		 
	}
}
