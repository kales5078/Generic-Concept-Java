package JavaCollections;

import java.util.Scanner;

public class FindMaxFloat {
	
	//declare the method to find Maximum of three Number
	public Float MaxFloat (Float  firstValue, Float  secondValue, Float  thirdValue) {
		Float  maxFloat  = firstValue;
		if (secondValue.compareTo(maxFloat ) > 0)
			maxFloat  = secondValue;
		if (thirdValue.compareTo(maxFloat ) > 0)
			maxFloat  = thirdValue;
		System.out.println("The Maximum value is :"+maxFloat );
		return maxFloat;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to program");
		   MainClass obj = new MainClass();
		
		//get Value from user 
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter first Value");
         Float  a = sc.nextFloat();
         System.out.println("Enter second Value");
         Float  b = sc.nextFloat();
         System.out.println("Enter third Value");
         Float  c = sc.nextFloat();
         
         //calling method
 		 obj.MaxFloat(a,b,c);

	}
}
