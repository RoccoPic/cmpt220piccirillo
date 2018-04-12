import java.util.ArrayList;
public class P13_03 {

	public static void main(String args[]) {
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add(5);
		list.add(10);
		list.add(6);
		list.add(19);
		list.add(84);
		list.add(61);
		list.add(0);
		list.add(42);
		list.add(9);
		
		System.out.println("Original List: " + list.toString());
		
		sort(list);
		
	      System.out.println("New List: " + list.toString());
	}
	
	public static void sort(ArrayList<Number> list) {
	for(int i = 0; i < list.size(); i++) { //checks the first num of the arraylist
		
		for(int j = i+1; j < list.size(); j++) { //gets the next option, runs through and checks
			Number temp = 0;
			if(list.get(i).doubleValue() > list.get(j).doubleValue()) {
				temp = list.get(j); //setting this is that bc it is greater than
				list.set(j, list.get(i));
				list.set(i, temp);
			}
		}
	}
	}
}
