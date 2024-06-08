package crack;

public class Swap {
	
	
	public static void main(String[] args) {
		int n=10;
		int m=20;
		
		System.out.println(n+" n no");
		System.out.println(m+" m no");
		
		/*int t;
		
		t=n;//t=10,n=10
		n=m;//n=20,m=20
		m=t;//t=10;m=10
		*/
		// without using temp variable//
		n=n+m; //n=30=10+20;
		m=n-m;//m=10=30-20;
		n=n-m;//n=20= 30-10;
		System.out.println(n+" after swap n no");
		System.out.println(m+" after swap m no");
	}

}
