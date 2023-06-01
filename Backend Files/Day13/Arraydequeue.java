package Day13;
import java.util.ArrayDeque;
public class Arraydequeue {
	public static void main(String[] args) {
		ArrayDeque s=new ArrayDeque();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.addFirst(60);
		s.addLast(10);
		s.offerFirst(10);
		System.out.println(s);
		System.out.println(s.getFirst());
		System.out.println(s.pop());
		System.out.println(s);
	}

}
