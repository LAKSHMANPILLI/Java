package Sting;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		String str="Jspiders and Qspiders";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(str.length()-1));
		for(int i=0;i<str.length();i++)
		System.out.println(i+"-->"+str.charAt(i));
	}

}
