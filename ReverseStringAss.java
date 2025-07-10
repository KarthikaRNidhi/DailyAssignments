package week3.day1;

public class ReverseStringAss {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		
		//splitting string in the form of space
		String split[]=test.split(" ");
		String odd;
		char[] oddWord;
		
		for(int i=0; i<split.length;i++){
		if(i%2!=0){
				odd=split[i];
				oddWord=odd.toCharArray();	
		for (int j=oddWord.length-1; j>=0; j--) 
		{
		System.out.println(oddWord[j]);		
		}
}
		else 
		{
			System.out.println(split[i]);
		}
		
}
		

	}

}
