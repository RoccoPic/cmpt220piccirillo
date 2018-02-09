
public class P6_1 {
	public static void main(String args[]) {
		for(int n = 1; n <= 100; n++) {
			System.out.print(getPentagonalNumber(n));
			if(n % 100 == 0) {
				System.out.print(".");
			} else if (n % 10 == 0) {
				System.out.print(",\t\n");
			} else {
				System.out.print(",\t");
			}
		}
	
	}
	 public static int getPentagonalNumber(int n) {
	int answer;
	
		answer = n *(3*n - 1) / 2;
		return answer;
	
		}
	
	}

