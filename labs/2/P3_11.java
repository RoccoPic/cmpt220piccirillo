import java.util.Scanner;

public class P3_11 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	int monthNum = 0;
		while(monthNum <1 || monthNum > 12) 
		{
			System.out.println("Please enter the number of a month:");
			monthNum = input.nextInt();	
			
			if(monthNum <1 || monthNum > 12)
			{
				System.out.println("Please enter a valid month number:");
			}
			
		}
		
			String monthName = "";
					if (monthNum == 1) {
						monthName = "January";
					} else if (monthNum == 2) {
						monthName = "February";
					} else if (monthNum == 3) {
						monthName = "March";
					} else if (monthNum == 4) {
						monthName = "April";
					} else if (monthNum == 5) {
						monthName = "May";
					} else if (monthNum == 6) {
						monthName = "June";
					} else if (monthNum == 7) {
						monthName = "July";
					} else if (monthNum == 8) {
						monthName = "August";
					} else if (monthNum == 9) {
						monthName = "September";
					} else if (monthNum == 10) {
						monthName = "October";
					} else if (monthNum == 11) {
						monthName = "November";
					} else if (monthNum == 12) {
						monthName = "December";
					}
			System.out.println("Please enter the year:");
			int year = input.nextInt();
			String yearDays= "";
			if (monthName == "January" || monthName == "March" || monthName == "May" || monthName == "July" || monthName == "August" || monthName == "October" || monthName == "December") {
				 yearDays = "31";
			} else if (monthName == "April" || monthName == "June" || monthName == "September" || monthName == "November") {
				 yearDays = "30";
			} else if (monthName == "February")
				if (year % 4 == 0) {
					yearDays = "29"; 
				} else {
					yearDays = "28";
				}
			
		
 System.out.println(monthName + " " + year + " has " + yearDays + " days.");

}
}

