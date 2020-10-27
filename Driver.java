import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
	
	public static void printCourse (ArrayList<Course>courses) {
		for(Course c : courses) {
			System.out.println("The course name is " + c.getCourseName() + ", it gets "
				+ c.getDuration() + " weeks. \nThe instructor of this course is a "
				+ c.getInstructor().getFirstName() + " " + c.getInstructor().getLastName() + " who is "
				+ c.getInstructor().getExperience() + " with "
				+ c.getInstructor().getExpYears() + " years of experience. \nThe phone number is: "
				+ c.getInstructor().getPhoneNum() + ".");
		}
	}
	

	
	public static String findCourse (ArrayList<Course>courses, String lastName) {
		for(Course u : courses) {
			if(u.getInstructor().getLastName().equalsIgnoreCase(lastName)) {
				return u.getCourseName();
			}
		}
		return "The instructor does not teach any course.";
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Course>courses = new ArrayList<Course>();
		
		Instructor instructor1 = new Instructor("John", "Smith", "854 876 3899", 3);
		Instructor instructor2 = new Instructor("Jane", "New", "978 957 3899", 1);
		Instructor instructor3 = new Instructor("Jim", "Old", "854 957 8544", 7);
		
		Course courseA = new Course("Math", 6, instructor1);
		Course courseB = new Course("Czech", 8, instructor3);
		Course courseC = new Course("Physics", 3, instructor2);
		
		courses.add(courseA);
		courses.add(courseB);
		courses.add(courseC);
		
		
		printCourse(courses);
		
		System.out.println();
		System.out.println("Enter last name of the instructor:");
		String userInput = input.nextLine();
		
		
		System.out.println();
		System.out.println(findCourse(courses, userInput));
		
		

	}

}
