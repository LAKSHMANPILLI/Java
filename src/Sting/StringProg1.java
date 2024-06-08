package Sting;

import java.util.Scanner;

public class StringProg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=sc.nextLine();
		int uc=0,lc=0,dc=0,s=0;
		int i;
		for(i = 0;i<st.length();i++);
		{
			//int i = 0;
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				uc++;
			else if(ch>'a'&&ch<='z')
				lc++;
			else if(ch>=0&&ch<=9)
				dc++;
			else
				s++;

		}
		System.out.println("capital letters is"+uc);
		System.out.println("small letters is"+lc);
		System.out.println("Digits letters is"+dc);
		System.out.println("special letters is"+dc);
	}

}
