package JavaCollections;

import java.util.Scanner;

public class MyclassString {

	public String maxString(String firstString, String secondString, String thirdString) {

		String maxString = firstString;
		if (secondString.compareTo(maxString) > 0)
			maxString = secondString;
		if (thirdString.compareTo(maxString) > 0)
			maxString = thirdString;
		System.out.println("Maximum Value is :" + maxString);
		return maxString;
	}

	public static void main(String[] args) {

		MyclassString obj = new MyclassString();

		// get Value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String a = sc.next();
		System.out.println("Enter second String");
		String b = sc.next();
		System.out.println("Enter third String");
		String c = sc.next();

		// calling method
		obj.maxString(a, b, c);

	}

}
