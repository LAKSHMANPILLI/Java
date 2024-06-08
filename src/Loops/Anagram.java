package Loops;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings:");
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		boolean rs=isAnagram(st1,st2);
		if(rs==true)
		{
			System.out.println("It is Angram");
		}
		else
		{
			System.out.println("It is not a Angram");
		}
	}
	static boolean isAnagram(String s1,String s2)
	{
		int count[]=new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				count[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				count[ch-97]++;
			}
		}
		int count2[]=new int[26];
		for (int i = 0; i < s2.length(); i++) {
			char ch=s2.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				count2[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				count2[ch-97]++;
			}
		}
		for (int i = 0; i <26; i++) {
			if(count[i]!=count2[i])
				return false;

		}
		return true;


	}
}
