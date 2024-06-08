package Loops;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of the Array:");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("Eneter "+n+"valaues");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
		  
	  }
	  int sum=0;
	  for(int i=0;i<a.length;i++)
	  {
		  sum=sum+a[i];
	  }
	  int sum1=sum/a.length;
	  System.out.println("Average is"+sum1);
	  
	}

}
