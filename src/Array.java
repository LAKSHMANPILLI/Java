
import java.util.LinkedList;

public class Array 
{
	public static void main(String[] args) 
	{
		//ArrayList<Integer> a1=new ArrayList<>();
	//	ArrayList a1=new ArrayList();
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(30);
		System.out.println(l1);
		System.out.println(l1.size());
		l1.addFirst(100);
		l1.addLast(200);
		System.out.println(l1);
		
	}

}
