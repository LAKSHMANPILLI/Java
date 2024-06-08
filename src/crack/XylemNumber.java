package crack;

public class XylemNumber {

	public static void main(String[] args) {
		
		int x=45618;
		int num=x;
		int ms=0,os=0;
		int d=x%10;//8
		os=os+d;//0+8=8//
		x=x/10;//4561
		while(x>9)//4561>9.....4>9
		{
			int k=x%10;//1//6//5
			ms=ms+k;//1//7//12//
			x=x/10;//456//45//4
		}
		os=os+x;//12
		if(os==ms)
			System.out.println(num+" xylem");
		else
			System.out.println(num+" not xylem");

	}

}
