package Day12;
import java.util.ArrayList;
public class DS {
	public static void main(String[] args) {
		ArrayList array=new ArrayList();
		array.add(10);
		array.add(12.55);
		array.add("Malik");
		array.add(3,"Java");
		System.out.println(array);
		System.out.println(array.contains("Malik"));
		array.remove(1);
		System.out.println(array);
		array.remove("Java");
		System.out.println(array);
		System.out.println(array.get(0));
		array.set(1, "Malik Basha");
		System.out.println(array);
		
}

}
