package Sting;

import java.util.Scanner;

public class DatingApp {
	public static void ageVarifier()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age>=20)
		{
			findyourmatch();
		}
		else
		{
			throw new InvalidAgeException("control your Self");
		}
	}
	public static void findyourmatch()
	{
		System.out.println("welcome");
		System.out.println("you can now start");
		
	}
	public static void main(String[] args) {
		ageVarifier();
	}

}
