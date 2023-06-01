package Day13;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);		
		System.out.println(s.pop());
		s.peek();
		System.out.println(s);
		
	}

}
