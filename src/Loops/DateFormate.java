package Loops;

public class DateFormate {

	public static void main(String[] args) {
		int d=14,m=7,y=2022;
		if(d<1||d>31||m<1||m>12||y<1)
			System.out.println("invalid date");
		else if((m==4||m==6||m==9||m==11)&&d>30)
			System.out.println("Invalid date");
		else if(m==2&&d>29)
			System.out.println("Invalid date");
		else if(m==2&&!(y%4==0||y%400==0&&y%100!=0)&&d>28)
			System.out.println("Invalid date");
		else
			System.out.println("valid date");

	}

}
