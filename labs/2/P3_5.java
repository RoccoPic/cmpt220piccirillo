import java.util.Scanner;

public class P3_5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day:");
		int dayNum = input.nextInt();
		String dayName = "";
		if (dayNum == 0){ 
			dayName = "Sunday";
		} else if (dayNum == 1) {
			dayName = "Monday";
		} else if (dayNum == 2) {
			dayName = "Tuesday";
		} else if (dayNum == 3) {
			dayName = "Wednesday";
		} else if (dayNum == 4) {
			dayName = "Thursday";
		} else if (dayNum == 5) {
			dayName = "Friday";
		} else if (dayNum == 6) {
			dayName = "Saturday";
		}
		
		System.out.println("Please enter the number of days elapsed since today:");
		int nextDay = input.nextInt();
		
		nextDay = nextDay + dayNum;
		
		while(nextDay > 6) {
			nextDay = nextDay - 7;
		}
			String futureDay = "";
		if(nextDay == 0) {
				futureDay = "Sunday";			
		} else if(nextDay == 1) {
				futureDay = "Monday"; 
		} else if(nextDay == 1) {
				futureDay = "Monday"; 
	    } else if(nextDay == 2) {
	    		futureDay = "Tuesday"; 
	    } else if(nextDay == 3) {
	    		futureDay = "Wednesday"; 
	    } else if(nextDay == 4) {
	    		futureDay = "Thursday"; 
	    } else if(nextDay == 5) {
	    		futureDay = "Friday"; 
	    } else if(nextDay == 6) {
	    		futureDay = "Saturday"; 
	   	}
		System.out.println("Today is " + dayName + " and the future day is " + futureDay);
	}
}		
	



