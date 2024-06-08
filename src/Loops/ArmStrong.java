package Loops;



public class ArmStrong {
	public static void main(String[] args) {


		int n=89;
		boolean rs=isAmstrong(n);
		if(rs==true)
			System.out.println(n+" is deserium");
		else
			System.out.println(n+" is not deseriam");

	}

	static boolean isAmstrong(int n) {
		int sum=0;
		int t=n;
		int dc=isCount(n);	
		do {

			int d=n%10;
			sum=sum+pow(d,dc);
			dc--;
			n=n/10;
		}
		while(n!=0);
		return sum==t;
	}

	private static int pow(int d, int dc) {

		int pw=1;
		while(dc>0)
		{
			pw=pw*d;
			dc--;
		}

		return pw;
	}

	private static int isCount(int n) {
		int c=0;
		do
		{
			c++;
			n=n/10;
		}while(n!=0);
		return c;
	}
}