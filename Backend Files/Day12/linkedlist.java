package Day12;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList <Integer>  L1=new LinkedList<Integer>();
		L1.add(5);
		L1.add(6);
		L1.add(7);
		L1.add(8);
//		L1.remove(0);
		
		for(int a:L1)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(L1.getLast());
		System.out.println(L1.getFirst());
		
		
		
	}

}
