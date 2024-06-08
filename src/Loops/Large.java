package Loops;



public class Large {

	public static void main(String[] args) {
		/*
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int b=isBIg(ar);
		System.out.println(b);

	}
	private static int isBIg(int[] ar) {
		int b=ar[0];
	for (int i = 0; i < ar.length; i++) {
		if(ar[i]>b)
			b=ar[i];
	}
		return b;
	}*/
		int []a= {9,8,4,5,2,7,2};
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
	}

}
