package crack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class B {

	public static void main(String[] args) {
		HashSet<Integer> v1=new HashSet<>();
		v1.add(10);
		v1.add(40);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		//hashSet into arrayList Coverting Sorting values//
		
		ArrayList a1=new ArrayList<>(v1);
		Collections.sort(a1);
	
		for(Object i:a1)
		{
			System.out.println(i);
		}
	}

}
