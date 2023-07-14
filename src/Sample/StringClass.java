package Sample;


import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringClass {

	String name = "Prakash";

	public void method() {


		int length = name.length();

		char charAt = name.charAt(3);

		boolean blank = name.isBlank();
		boolean empty = name.isEmpty();

		System.out.println("Empty: "+blank + "-" + empty);

		System.out.println("Character: "+charAt + "\r" +"Length: "+length);
	}

	public static StringBuffer stringReverse(String name) {
		StringBuffer reverse = new StringBuffer(name);
		return reverse.reverse();
	}
	
	

	public static void main(String[] args) {
		StringClass s = new StringClass();
		s.method();
		
		String xpath="//button[@name='[NAME]']";
		System.out.println(xpath.replace("[NAME]","Button"));
		
//
//		String name = "ABCD";
//		String rev = "";
//		for (int i = name.length() - 1; i >= 0; i--) {
//			rev = rev + name.charAt(i);
//		}
//		System.out.println(rev);
//
		String name2 = "Saranya";
		System.out.println(stringReverse(name2));
//
//		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
//		System.out.println("The largest number is: " + Collections.max(numbers));
//
		String Char = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Char.replaceAll("[a-z]", ""));

	}
}
