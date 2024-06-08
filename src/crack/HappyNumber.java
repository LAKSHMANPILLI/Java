package crack;

public class HappyNumber {

	public static void main(String[] args) {
		int n=320;
		int n1=n;
		//int sum=0;
		while(n>9)
		{
			int sum=0;
			do{
				int ld=n%10;//0//2//3//3
				sum=sum+ld*ld;//0//4//13
				n=n/10;//32//3//13
			}while(n!=0);//32!=0
			n=sum;
		}
		if(n==1||n==7)
		System.out.println(n1+" is happy Number");
		else
			System.out.println(n1+" is not happy Number");
		
	}

}
