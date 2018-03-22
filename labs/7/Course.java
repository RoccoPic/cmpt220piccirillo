import java.util.Arrays;
public class Course {
private String courseName;
private String[] students = new String[0];
private int numberOfStudents;

public Course(String courseName) {
	this.courseName = courseName;
}
public void addStudent(String student) {
	numberOfStudents++;
	String[] newArray = Arrays.copyOf(students, numberOfStudents);
	students = newArray;
	students[numberOfStudents-1] = student;
}
public String[] getStudents() {
	
	String[] newArray = Arrays.copyOf(students, numberOfStudents);
	return newArray;
}
public int getNumberOfStudents() {
	return numberOfStudents;
}
public String getCourseName() {
	return courseName;
}
public void dropStudent(String student) {
	numberOfStudents--;
	String[] newArr = new String[numberOfStudents];
	int num = Arrays.asList(students).indexOf(student);
	for(int i = 0; i < numberOfStudents; i++) {
		if(i < num) {
			newArr[i] = students[i];
		} else {
			newArr[i] = students[i + 1];
		}
	}
	students = newArr;
}
public void clear() {
	students = new String[0];
}
}
