package Loops;
import java.util.Scanner;
public class java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s1=sc.nextLine();
		String s2="";
		int count=0;
		char []a=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		
			count++;
			
		}
		//s2=s2.trim();
		System.out.println(count);

	}

}
