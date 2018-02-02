import java.util.Random;
import java.util.Scanner;
public class P3_17 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Random rando = new Random();
		int pickMove = 3;
		
		while (pickMove < 0 || pickMove > 2) 
		{
			System.out.println("Please input your move:");
			System.out.println("scissor (0), rock (1), paper (2):");
			 pickMove = input.nextInt();
			if (pickMove < 0 || pickMove > 2) 
			{
				System.out.println("Invalid Input: Please input a value between 0-2.");
			}
		}
		
		String playerMove = "";
		
		if (pickMove == 0 ) {
			playerMove = "You are Scissor"; 
		} else if (pickMove == 1) {
			playerMove = "You are Rock";
		} else if (pickMove == 2) {
			playerMove = "You are Paper";
		}
		
		System.out.println(playerMove);
		
		int compMove = rando.nextInt(2);
		if (compMove == 0) {
			System.out.println("The computer is scissor.");
		} else if (compMove == 1) {
			System.out.println("The computer is rock.");
		} else {
			System.out.println("The computer is paper.");
		}
		if  (pickMove == 0 && compMove == 0) {
			System.out.println("It is a draw.");
		} else if (pickMove == 1 && compMove == 1) {
			System.out.println("It is a draw."); 
		} else if (pickMove == 2 && compMove == 2) {
			System.out.println("It is a draw.");
		} else if (pickMove == 0 && compMove == 1) {
			System.out.println("You lost.");							
		}	else if (pickMove == 0 && compMove == 2) {
			System.out.println("You won.");	
		}	else if (pickMove == 1 && compMove == 0) {
			System.out.println("You won.");	
		}	else if (pickMove == 1 && compMove == 2) {
			System.out.println("You lost. ");	
		}	else if (pickMove == 2 && compMove == 0) {
			System.out.println("You lost.");		
		}	else if (pickMove == 2 && compMove == 1) {
			System.out.println("You win.");	
	} 
	}
}