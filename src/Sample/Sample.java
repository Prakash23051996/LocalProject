package Sample;

import java.util.Scanner;

public class Sample {

	String nextLine="";
	int  nextInt=0;
	
	private void getMethod() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Name: ");
		 nextLine = s.nextLine();
		System.out.println("Enter phoneNumber: ");
		 nextInt = s.nextInt();
	}
	private void method2() {
		System.out.println("Name: "+nextLine);
		System.out.println("PhoneNumber: "+nextInt);

	}
	public static void main(String[] args) {
		
		Sample sa = new Sample();
		
		sa.getMethod();
		sa.method2();
		
	}
	

	
}
