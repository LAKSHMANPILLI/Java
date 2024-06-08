package Loops;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Size of the Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enetr the"+n+"Values");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Usered entered array");
		
		int esum=0;
		int osum=0;
		for(int i=0;i<a.length;i++)
		{
			int ld=a[i]%10;
			if(ld%2==0)
			{
				esum=esum+ld;
			}
			else
			{
				osum=osum+ld;
			}
			a[i]=a[i]/10;
			
		}
		System.out.println("Even"+esum);
		System.out.println("Odd"+osum);

	}

}
