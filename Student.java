package edu.umsl.constructorprogram;

public class Student {
private int studentId;
private int dateOfBirth;
private String address;
private double gpa;
	public Student(int studentId, int dateOfBirth, String address, double gpa) {
		this.studentId = studentId;
		this. dateOfBirth = dateOfBirth;
		this.address = address;
		this.gpa = gpa;
	}
	public int getStudentId() {
		return studentId;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public double getGpa() {
		return gpa;
	}

}
