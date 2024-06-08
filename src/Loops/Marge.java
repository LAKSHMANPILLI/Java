package Loops;

public class Marge {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,8,9};
         int c[]=isMerge(a,b);
         for (int i = 0; i < c.length; i++) {
        	 System.out.print(c[i]+",");
			
		}
	}

	private static int[] isMerge(int[] a, int[] b) {
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
			for (int j = 0; j < b.length; j++) {
				c[a.length+j]=b[j];
				
			}
		
		return c;
	}

}
