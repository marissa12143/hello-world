package edu.umsl.constructorprogram;

public class ConstructorProgram {

	public static void main(String[] args) {
		Student s = new Student(258776, 62599, "123 laneroad", 3.1);
		
		System.out.println("Student ID " + s.getStudentId() + "Date of Birth " + s.getDateOfBirth() + "address " + s.getAddress()+ "GPA " + s.getGpa());
	}

}
