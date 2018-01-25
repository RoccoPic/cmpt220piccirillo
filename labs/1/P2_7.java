import java.util.Scanner;

public class P2_7 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); 
		System.out.print("Enter the number of minutes:");
		 double minutes = input.nextDouble();
		 double year = (minutes / 525600);
		 double day = (minutes % 525600) / 1440;
		System.out.print((int) minutes + " minutes is approximately " +(int)  year + " years and " + (int) day + " days.");
}
}
