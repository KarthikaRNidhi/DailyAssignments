package week1.day2;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int n=8, fnum=0, lnum=1;
		int nextnum;
		
		for(int i=1; i<=n;i++)
		{
			System.out.println(fnum);
			nextnum=fnum+lnum;
			fnum=lnum;
			lnum=nextnum;
		
	}

}
}

