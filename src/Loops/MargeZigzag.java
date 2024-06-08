package Loops;

public class MargeZigzag {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {4,3,2,1,9,8,6,7,5};
		int c[]=isZig(a,b);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+",");
			
		}

	}

	private static int[] isZig(int[] a, int[] b) {
       int c[]=new int[a.length+b.length];
        int j = 0;
        int i=0;
		while(i<a.length&&i<b.length)
        {
        	
			c[j]=a[i];;
        	j++;
        	c[j]=b[i];
        	i++;
        	j++;
        	
        }
		while(i<a.length)
		{
			c[j]=a[i];
			i++;
			j++;
		}
		while(i<b.length)
		{
			c[j]=b[i];
			c[j]=b[i];
		}

		return c;
	}

}
