package dailyAssignments_21May;

public class Student {
	String name;
	int age;
	int rollNo;
	
	public void displayStudent() {
		
		System.out.println("The name is " + name);
		System.out.println("The age is " + age);
		System.out.println ("The roll number is " + rollNo);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.name= "Srikanth";
		s.age=35;
		s.rollNo=10;
		s.displayStudent();
	

	}

}
