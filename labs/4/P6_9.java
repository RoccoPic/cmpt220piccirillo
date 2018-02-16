import java.text.NumberFormat;
public class P6_9 {
	public static void main(String [] args)
	{
		//Controls how many decimal points 
		NumberFormat decimal = NumberFormat.getNumberInstance();
		decimal.setMaximumFractionDigits(3);
		decimal.setMinimumFractionDigits(3);
		
		System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
		System.out.println("------------------------------------------------------");
		
		double meters = 20;
		String conversionOut = "";
	
		for (int i = 1; i <=10; i ++) 
		{
			//Prints i which functions as the Feet Calculations
			conversionOut = conversionOut + i + "\t\t";
			//Prints the footToMeter Calculation
			double footToMeter = footToMeter(i);
			conversionOut = conversionOut + decimal.format(footToMeter)  + "\t|";
			//Prints the meters that will serve as the meter Calculation
			conversionOut = conversionOut + "\t" + meters + "\t\t";
			//Prints the meterToFoot Calculation
			double meterToFoot = meterToFoot(meters);
			conversionOut = conversionOut + decimal.format(meterToFoot) + "\n";
			
		 //Brings meters variable to the next required measurement
			meters = meters + 5;
		}
			System.out.println(conversionOut);
	}
	// Convert from feet to meters
		public static double footToMeter(double foot) {
			double meter = foot * 0.305;
			return meter;
		}
		//** Convert from meters to feet 
		public static double meterToFoot(double meter) {
			double foot = 3.279 * meter;
			return foot;
		}

				  }