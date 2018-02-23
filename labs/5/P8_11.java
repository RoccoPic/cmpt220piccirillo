import java.util.Scanner;
public class P8_11 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int[][] binaryMatrix = new int[3][3];
		int num = 0;
		
		boolean runLoop = true;
		System.out.print("Enter a number between 0 and 511: ");
		while (runLoop == true) {
			num = input.nextInt();
			if(num >= 0 && num<= 511) {
				runLoop = false;
			} else {
				System.out.print("This number is not inbetween 0 and 511.  Please enter a number between 0 and 511: ");
			}
		}
		String binary = Integer.toBinaryString(num);
		String addZero = "0";
		while(binary.length() < 9) {
			binary = addZero.concat(binary);
		}
		int counter = 0;
		int binaryNum = 0;
		for(int i = 0; i < 3; i++) {
			for( int j = 0; j < 3; j++) {
				binaryNum = binary.charAt(counter);
				
				binaryMatrix[i][j] = binaryNum;
				counter++;
			}
		}
		int count = 0;
		for(int a = 0; a < 3; a++) {
			for(int b = 0; b < 3; b++) {
				if(count == 2) {
					int headsOrTails1 = binaryMatrix[a][b] - 48;
							if(headsOrTails1 == 0) {
								System.out.println("H" + "   ");
								count = 0;
							} else {
								System.out.println("T" + "   ");
								count = 0;
							}
				} else {
					int headsOrTails2 = binaryMatrix[a][b] - 48;
					if(headsOrTails2 == 0) {
						System.out.print("H" + "   ");
						count++;
					} else {
						System.out.print("T" + "   ");
						count++;
					}
			}
		}
	}
}
}