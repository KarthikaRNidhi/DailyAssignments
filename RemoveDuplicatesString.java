package week3.day1;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String duplicate="We learn Java basics as part of java sessions in java week1";
		//String str=duplicate.toLowerCase();
		String[] split = duplicate.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
				{
					split[j]=" ";
					
				}
			}
			
		}
		for(int i=0; i<split.length;i++)
		{
		System.out.println(split[i]);
	    }

}
}