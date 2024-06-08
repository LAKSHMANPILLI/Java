
public class fabaccio2 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int sum=0;
		int c=4;
		System.out.println(a+""+b);
		for (int i = 0; i<=c; i++) {
			sum=a+b;//3
			a=b;//
			b=sum;
			System.out.println(sum+" ");
			
		}
		
		
	}

}
