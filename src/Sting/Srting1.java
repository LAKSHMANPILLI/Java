package Sting;

import java.util.Scanner;

public class Srting1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s1=sc.nextLine();
		//String s2="";
		char []a=s1.toCharArray();
		/*for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		//s2=s2.trim();
		System.out.println(s2);
*/
		char t;
		for(int i=0;i<a.length/2;i++)
		{
			 t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]= t;
			}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
