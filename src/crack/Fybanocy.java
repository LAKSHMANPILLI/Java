package crack;

public class Fybanocy {

	public static void main(String[] args) {
	
		//int x=10;
		/*
		int sum=0;
		int y1=0,y2=1,y3;//
		while(y1<50)
		{
			System.out.print(y1+" ");
			y3=y1+y2;//1//2//3//5//8
		    y1=y2;//
		    y2=y3;
		}*/
		int a=1;
		int b=2;
		int sum=0;
		int x=50;
		System.out.println(a+"\n"+b+" ");
		for (int i =0; i <= x; i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum+" ");
			
		}
	}
}
		
