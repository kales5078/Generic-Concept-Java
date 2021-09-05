package JavaCollections;

import java.util.Scanner;

public class Findmaximum {
	
	//declare the method to find Maximum of three Number
	public Integer MaximumIntegeriger(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer maxInteger = firstValue;
		if (secondValue.compareTo(maxInteger) > 0)
			maxInteger = secondValue;
		if (thirdValue.compareTo(maxInteger) > 0)
			maxInteger = thirdValue;
		System.out.println("The Maximum value is :"+maxInteger);
		return maxInteger;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to program");
		   MainClass obj = new MainClass();
		
		//get Value from user 
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter first Value");
         Integer a = sc.nextInt();
         System.out.println("Enter second Value");
         Integer b = sc.nextInt();
         System.out.println("Enter third Value");
         Integer c = sc.nextInt();
         
         //calling method
 		 obj.MaximumIntegeriger(a,b,c);

	}
}
