package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		Collections.sort(a1);
		System.out.println("sort"+a1);
		System.out.println("size"+a1.size());
		//Collections.sort(a1);
		
		a1.add(1.4);
		a1.add("hello");
		a1.add(true);
		
		
		
		for(Object i:a1)
		{
			System.out.println(i);
		}
		Collections.reverse(a1);
		System.out.println("reverse"+a1);
		a1.remove("hello");
		System.out.println("remove"+a1);
		a1.add(1,500);
		System.out.println(a1);
		System.out.println(a1.get(0));
		ArrayList<Integer>a2=new ArrayList<>();
		a2.add(9);
		a2.add(8);
		a2.add(7);
		for(int i=0;i<a2.size();i++)
		System.out.println("homogeneous"+a2.get(i));
		System.out.println(a1);
		System.out.println("index"+a1.indexOf(30));
		a1.set(2, 15);
		System.out.println("after set"+a1);
		a1.clear();
		System.out.println("clear"+a1);
		a1.removeAll(a1);
		System.out.println("removeAll"+a1);
		
		
		
			
	}
		

}
