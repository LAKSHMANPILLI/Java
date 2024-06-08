package Loops;
import java.util.ArrayList;
import java.util.Collections;
public class C1
{

	public static void main(String[] args)
	{

		ArrayList al=new ArrayList();

		al.add(4);

		al.add(15);

		al.add(6);

		al.add(123);

		al.add (76);

		System.out.println("Before sorting -->"+al);

		Collections.sort (al);

		System.out.println("After sorting -->"+al);

		Collections.reverse (al);

		System.out.println("Descending order-->"+al);
	}
}



