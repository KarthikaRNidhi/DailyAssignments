package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> arrange=new ArrayList<Integer>();
		arrange.add(1);
		arrange.add(2);
		arrange.add(4);
		arrange.add(3);
		arrange.add(6);
		arrange.add(8);
		arrange.add(10);
		Collections.sort(arrange);
		System.out.println(arrange);
		
	   for(int i=0;i<arrange.size()-1;i++) {
	        if (arrange.get(i+1) - arrange.get(i) != 1) {
	        	 System.out.println(arrange.get(i)+1);
	        } 
	        else {
	        }
	       
	    }
	}
}


