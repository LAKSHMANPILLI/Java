package Loops;

public class EsOs {

	public static void main(String[] args) {
		int x[]={3,2,4,3,2,6,5,1};
		int esum=0,osum=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
				esum++;
			else if(x[i]%2==1)
			{
				osum++;
			}
		}
			System.out.println("even"+esum);
			System.out.println("Odd"+osum);
		}

	}
