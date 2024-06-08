package Sting;

import java.util.Scanner;

public class kar {

	public static void main(String[] args) {
		System.out.println("Enter the Nuber:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		try
		{
			if(n>10)
			{
				System.out.println("enter the value of a");
				int a=sc.nextInt();
				System.out.println("enter the value of b");
				int b=sc.nextInt();
				System.out.println(a/b);
			}
			else 
			{
				int []ar=null;
				System.out.println(ar[0]);
			}
		}
			catch(NullPointerException k)
			{
				System.out.println("It can be NullEcep");
			}
			catch(ArithmeticException k)
			{
				System.out.println("it can be ArithematicExcep");
			}
	
			catch(Exception k )
			{
				System.out.println("Default");
			}
			
		}
	}


