package Day13;
import java.util.PriorityQueue;
import java.util.LinkedHashSet;
public class Priorityqueue {
	public static void main(String[] args) {
		PriorityQueue  s=new PriorityQueue();
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(50);
		s.offer(5);
		s.offer(22);
		s.offer(8);
		s.offer(10);
		s.offer(5);
		s.offer(20);
		s.offer(88);
		s.offer(1);
		while(!s.isEmpty())
		{
			System.out.println(s.poll());
		}
			
		System.out.println(s);
	}
}
