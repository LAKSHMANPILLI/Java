package Loops;
import java.util.Scanner;
public class ecountOcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the"+n+"values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		
		}
		System.out.println("Entered array elements");
		int ec=0,oc=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				//ec=ec+a[i];
				ec++;
			}
			else if(a[i]%2==1)
			{
				//oc=oc+a[i];
				oc++;
			}
		}
			System.out.println("EvenCount is"+ec);
			System.out.println("Oddcount is"+oc);
	}

}
