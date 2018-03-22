
public class P10_09 {
	public static void main(String args[]) {
	Course myCourse = new Course("Philosophy 101");
	
	myCourse.addStudent("Rob");
	myCourse.addStudent("Anya");
	myCourse.addStudent("Sandra");
	
	System.out.println("The name of the course is " + myCourse.getCourseName());
	
	System.out.println("The course has " + myCourse.getNumberOfStudents() + " students.");
	
	String[] students = myCourse.getStudents();
	System.out.print("The names of the students in the class are ");
	for(int i = 0; i < students.length; i++) 
		System.out.print(students[i] + " ");
	System.out.print("\n\n");
	
	myCourse.dropStudent("Rob");
	System.out.println("Rob dropped out");
	System.out.println("There are now " + myCourse.getNumberOfStudents() + " enrolled in this course");
	students = myCourse.getStudents();
	for(int j = 0; j < students.length; j++)
		System.out.print(students[j] + " ");
	System.out.print("\n\n");
	
	}
}
