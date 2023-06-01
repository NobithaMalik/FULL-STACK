package Day6;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Demo {
	public static void main(String[] args) {
		int array_size=6;
		int[] int_array=(int[])Array.newInstance(int.class, array_size);
		System.out.println(Arrays.toString(int_array));
	}
}


