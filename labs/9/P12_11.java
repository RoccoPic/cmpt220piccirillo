import java.io.*;
import java.util.*;

public class P12_11 {
	
	public static void main(String[] args) throws Exception {
	
		if (args.length != 2) {
			System.out.println("Usage: java RemoveText filename"); //this basically states what I am doing
			System.exit(1);
		}

		// Check if file exists
		File file = new File(args[1]);
		if (!file.exists()) {
			System.out.println("File " + args[1] + " does not exist"); //prints if the file doesn't exist
			System.exit(2);
		}

		// Create an ArrayList
		ArrayList<String> s2 = new ArrayList<>();  //creates a string 
		try (
			// Create input file
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine(); //removes components from s1 and adds others to the spare string
				s2.add(removeString(args[0], s1));
			}
		}

		try (
			// Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < s2.size(); i++) { //basically just prints the output depending on the size of string 2
				output.println(s2.get(i));
			}
		}
	}

	public static String removeString(String string, String line) {
		StringBuilder stringBuilder = new StringBuilder(line);
		int start = stringBuilder.indexOf(string); // Start index
		int end = string.length(); // End index

		while (start >= 0) {
			end = start + end;
			stringBuilder = stringBuilder.delete(start, end);
			start = stringBuilder.indexOf(string, start); 
		}

		return stringBuilder.toString();
	}
}