import java.text.NumberFormat;
public class P5_5 {
	public static void main(String [] args)
	{
		//Controls how many decimal points for kilograms to pounds
		NumberFormat pounds = NumberFormat.getNumberInstance();
		pounds.setMaximumFractionDigits(1);
		pounds.setMinimumFractionDigits(0);
		
		//Controls how many decimal points for pounds to kilograms
		NumberFormat kilograms = NumberFormat.getNumberInstance();
		kilograms.setMaximumFractionDigits(2);
		kilograms.setMinimumFractionDigits(0);
		
		String conversionOut = "";
		
		System.out.println("Kilograms\tPounds\t|  Pounds\tKilograms");
		
		int secondValue = 20;
		
		for (int i = 1; i <=199; i += 2) 
		{
			double kilo2pound = i * 2.2;
			double pound2kilo = secondValue * .4545;
			conversionOut = conversionOut + i + "\t\t" + pounds.format(kilo2pound)  + "\t|";
			conversionOut = conversionOut + secondValue + "\t\t" + kilograms.format(pound2kilo) + "\n";
			secondValue = secondValue + 5;
		}
			System.out.println(conversionOut);
	}

				  }
