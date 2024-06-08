package Loops;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Main started()");
		char ch='e';
		switch(ch)
		{
		case 'a':System.out.println(ch+"is lower case vowel ");
		break;
		case 'e':System.out.println(ch+" is lower case vowel ");
		break;
		case 'i':System.out.println(ch+" is lower case vowel ");
		break;
		case 'o':System.out.println(ch+"is lower case vowel ");
		break;
		case 'u':System.out.println(ch+"is lower case vowel ");
		break;
		default:System.out.println(ch+" is not a vowel");
		}
		System.out.println("main Ended()");
		}
	}
