package Loops;

import java.util.Arrays;

public class Ana {
	
	public static void main(String[] args) {
		String a = "keep";
		String b = "peek";
		if(a.length()!=b.length())//4!=4
		{
			System.out.println("is not Anagrem");
		}
		char ch[]=a.toCharArray();
		char ch1[]=b.toCharArray();
		Arrays.sort(ch);//act
		Arrays.sort(ch1);//act
		if(Arrays.equals(ch, ch1)==true)
		{
			System.out.println(" is Anagram");
		}
		
	}

}
