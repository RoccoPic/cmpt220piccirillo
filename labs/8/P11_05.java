
public class P11_05 {
	public static void main(String[] args) {
		Course course1 = new Course("Cooking 101");
		Course course2 = new Course("Software Dev 1");

		course1.addStudent("Jon Snow");
		course1.addStudent("Ned Stark");
		course1.addStudent("Stannis Baratheon");

		course2.addStudent("Jon Snow");
		course2.addStudent("Theon Greyjoy");

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNumberOfStudents() + "\n");
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");

	}
}
