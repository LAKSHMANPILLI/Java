package Loops;

public class Freequence {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,8,9};
         int c=isCount(a,9);
         System.out.println(c);
	}

	private static int isCount(int[] a, int ele) {
		int m=-1;
		int sm=-1;
      for (int j = 0; j < a.length; j++) {
    	  while(a[j]>m)
    	  {
    		  sm=m;
    		 m=a[j];
		}
    	  while(a[j]>sm&&a[j]!=m)
    	  {
    		  sm=a[j];
    	  }
		
	}

		return sm;
	}

}
