package Day12;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayADD {
	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("f");
		a.add("s");
		a.add("t");
		a.add("r");
		System.out.print("original ArrayList:");
		System.out.println(a);
		a.add("0");
		a.add("t");
		System.out.print("After copt: ");
		System.out.println(a);
		}
}