package Sting;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=sc.nextLine();
		int count[]=new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			//count[ch]++;
			if(ch>'A'&&ch<'Z')///pangram 
			{
				count[ch-65]++;
			}
			else if(ch>='a'&&ch<'z')
			{
				count[ch-97]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if(count[i]!=0)
				System.out.println((char)(i+97)+"-->"+count[i]);
		}

	}

}
