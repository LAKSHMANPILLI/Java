package Loops;
import java.util.Scanner;
public class primeCo {
	public static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Eneter the Size of the array:");
			int n=sc.nextInt();
			int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	return a;
	}

    /*static void dispArray(int a[])
    {
	    for(int i=0;i<a.length;i++)
	     {
		    System.err.println(a[i]+"");
	      }
	      System.out.println();
     }*/
    public static int getPri(int a[])
    {
    	int cPrime=0;
    	for(int i=0;i<a.length;i++)
    	{
    		while(a[i]!=0)
    		{
    			int d=a[i]%10;
    		if(d==1||d==2||d==3||d==5||d==7)
    		{
    			cPrime++;
    		}
    		a[i]=a[i]/10;
    		}
    	}
    	return cPrime;
    }
    public static void main(String []args)
    {
    	int x[]=readArray();
    	System.out.println("User enterd array:");
    	//dispArray(x);
    	int cPrime=getPri(x);
    	System.out.println("Number of Prime Digits is "+cPrime);
    	
    }
}
