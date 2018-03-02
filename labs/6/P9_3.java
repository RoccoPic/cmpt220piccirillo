import java.util.Date;
public class P9_3 {
	public static void main(String args[]) {
		Date date = new Date();

	long time = 10000;
	String string = "";
	for(int i = 0; i < 8; i++) {
		date.setTime(time);
		string = date.toString();
		System.out.println("The date after " + time + " units after elapsed time is " + string);
		
		time = time * 10;
	}

}
}