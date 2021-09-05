package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Genericuc4 {

	public void maximumInteger() {
		
		ArrayList<Integer> intvalue = new ArrayList<Integer>();
		
		intvalue.add(37);
		intvalue.add(67);
		intvalue.add(86);
		intvalue.add(65);
		intvalue.add(45);
	    
	    Collections.sort(intvalue, Collections.reverseOrder());
	    
	    
		System.out.println("The  value in ArraayList is:" + intvalue);
		System.out.println("The Maximum ArraayList value is:");
	     int first = intvalue.get(0); 
		 System.out.println(first);
		
		}
	    
	    public static void main(String args []) {
	    	Genericuc4 obj = new Genericuc4();
	    	obj.maximumInteger();
	    	
	    }

	}
