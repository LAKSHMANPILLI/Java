package Loops;

public class Countori {

	public static void main(String[] args) {
	int n=1234;
	int c=0;
	do {
		c++;
		n=n/10;
	}
	while(n!=0);
System.out.println(c);
	}

}
