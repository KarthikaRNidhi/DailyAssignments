package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindSecondlargestno {

	public static void main(String[] args) {
	  /*int array[]= {3, 2, 11, 4, 6, 7};
		Arrays.sort(array);
		System.out.println(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);	
		}*/
		List<Integer>second=new ArrayList<Integer>();
		second.add(2);
		second.add(3);
		second.add(4);
		second.add(6);
		second.add(7);
		second.add(11);
		System.out.println(second);
		System.out.println(second.size());
		Integer secondinteger = second.get(4);
		System.out.println(secondinteger);
		
		

	}

}
