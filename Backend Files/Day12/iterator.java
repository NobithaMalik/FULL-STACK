package Day12;
import java.util.Iterator;
import java.util.LinkedList;
public class iterator {
	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList <Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
}
}
