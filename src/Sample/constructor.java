package Sample;

import java.lang.String;

public class constructor {
	int rollno;// instance variable
	String studentName;
	static String college = "ITS";// static variable
	// constructor

	constructor(int number, String name) {
		rollno = number;
		studentName = name;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + studentName + " " + college);
	}

// Test class to show the values of static variable
	public static void main(String args[]) {
		constructor s1 = new constructor(111, "Prakash");
		constructor s2 = new constructor(222, "Jothivel");
		s1.display();
		s2.display();

	}

}
