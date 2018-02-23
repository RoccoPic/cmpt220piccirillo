import java.util.Scanner;
public class project1 {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	
	int smallest = input.nextInt();
	double tape = 0;
	int neededPaper = 2;
	boolean possible = false;
	for(int i = 2; i <= smallest; i++) {
		int amt = input.nextInt();
		tape +=  neededPaper / 2 * calcTapePieces(i);
		if(amt >= neededPaper) {
			possible = true;
			break;
		}
		neededPaper = 2 * (neededPaper - amt);
	}
	if(possible) {
		System.out.print(tape);
	} else {
		System.out.print("impossible");
	}
	}
	public static double calcTapePieces(int size) {
		return(Math.pow(2.0, .25)) * Math.pow(Math.sqrt(2) / 2, size);
	}
}
