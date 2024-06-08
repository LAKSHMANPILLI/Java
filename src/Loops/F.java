package Loops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class F {

	public static void main(String[] args) //trows ArithmeticException
	{
		int a=10,b=0;
		try {

			FileOutputStream f1=new FileOutputStream("D://hello.txt");
			System.out.println("File created");
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic handleld");
		}
	

	catch(FileNotFoundException k)
	{
		System.out.println("File creation Failed");
	}
		
		System.out.println(a/b);
		

}
}
