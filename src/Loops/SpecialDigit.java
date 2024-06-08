package Loops;

public class SpecialDigit {

	public static void main(String[] args) {
	    int x=49;
	    int d1=x/10;//4
	    int d2=x%10;//9
	    int sum=d1*d2+d1+d2;//36+13=49
	    if(sum==x)
	    {
	    	System.out.println(x+" is a spacial two digit number");
	    }
	    else
	    {
	    	System.out.println(x+" is not a spacial two digit number");
	    }

	}

}
