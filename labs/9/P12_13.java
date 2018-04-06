import java.io.*;
import java.util.*;

public class P12_13 {
	
	public static void main(String args[]) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java filename"); //this is for the name of the file that we are testing
			System.exit(1);
		}
		
		// this is just being used to see if the file actually exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.print("File " + args[0] + " does not exist"); //if the file does not exist this will print
			System.exit(2);
		}
	
		int characters = 0; //number of char
		int words = 0;		//number of words
		int lines = 0;		//number of lines
		
		try(Scanner input = new Scanner(file); )
				{ while (input.hasNext()) {
						lines++;
						String line = input.nextLine(); //to store the whole line as a string
						characters += line.length(); //takes the length and counts the chars
				}
	}
		try (Scanner input = new Scanner(file);) {
				while(input.hasNext()) {
				String line = input.next(); 
				words++;
			}
		}
		System.out.print("The file named: " + file.getName() + " has" + characters + " characters, " + words + " words, and " + lines + " lines.");
	}
}
