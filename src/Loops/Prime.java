package Loops;

public class Prime {
	public static void main(String[] args) {
		int n=23;
		int count=0;
		for(int i=2;i<=n/2;i++)//7/2
		{
			if(n%i==0)//7%2==0//7%3==0//....//7%7==0
				count++;
		}
		if(count>=1)
			System.out.println(n+" is not  prime");
		else
			System.out.println(n+" is  prime");
	}
}
