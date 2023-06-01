package Day12;
import java.util.ArrayList;
import java.util.Iterator;
public class listiterator {
	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("arpita");
		a.add("tejashwini");
		a.add("vinod");
		a.add("rajeswari");
		a.add("kiran");
		System.out.println(a);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			if(i.next().equals("vinod"))
			{
				i.remove();
			}
		}
		System.out.println(a);
	}
}