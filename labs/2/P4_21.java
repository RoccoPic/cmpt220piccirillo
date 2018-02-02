import java.util.Scanner;
public class P4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Social Security Number:");
		String ssn = input.nextLine();
		
		//testing for length
		if(ssn.length() == 11) {
			//making sure there are dashes where there should be 
			if(ssn.substring(3,4).equals("-") & ssn.substring(6,7).equals("-")) {
				for(int x = 0; x < 11; x++) {
					if (x ==3 || x ==6)
						continue;
					if(!Character.isDigit(ssn.charAt(x))) {
						System.out.println(ssn + " is not a valid Social Security Number.");
						System.exit(0);
					}
				}
						System.out.println(ssn + " is a valid Social Security Number.");
			}
			else {
				System.out.println(ssn + " is not a valid Social Secuirity Number.");
			}
		}
		else {
			System.out.println(ssn + " is not a valid Social Security Number.");
		}
	}
}
