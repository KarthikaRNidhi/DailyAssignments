package week3.day1;

public class IntersectionArray {

	public static void main(String[] args) {
		int number[]= {3,2,11,4,6,7};
		int number1[]= {1,2,8,4,9,7};
		for(int i=0; i< number.length; i++)
		{
			for(int j=0;j<number1.length;j++)
			{
				if(number[i]==number1[j])
				{
					System.out.println("Intersection numbers are:" +number[i]);
				}
					
			}
		}
		
	}

}
