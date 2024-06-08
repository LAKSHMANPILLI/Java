package crack;

public class Palindromno {

	public static void main(String[] args) {
	
		int n=343;
		
	int rev=0; int t=n;
	
	while(n!=0)
	{
		int x=n%10;//3//4//3
		rev=rev*10*x;//3//34//343
		n=n/10;//34//3//0
		
	}
	if(t==rev)
	{
		System.out.println(rev+" pandrome");
	}
	else {
		System.out.println(rev+" not pandrome");
	}
		/*int a=10;
		int b=20;
		
		
		//witoint ut using third var//
		int t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
*/
	}

}
