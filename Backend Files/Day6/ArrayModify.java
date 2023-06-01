
package Day6;
import java.util.Arrays;
public class ArrayModify {
	public static void main(String[] args) {
		int arr[]= {20,40,60};
		// if we add final it can't be excuted final int arr[]= {20,40,60};
		arr=new int[] {90,100,110};
		System.out.println(Arrays.toString(arr));
	}
}
