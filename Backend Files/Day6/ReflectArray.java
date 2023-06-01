package Day6;
import java.lang.reflect.Array;
public class ReflectArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Class CT=arr.getClass().getComponentType();
		System.out.println("Type:"+CT);
		int length=Array.getLength(arr);
		System.out.println("Length is :"+length);
		int Ele=(int)Array.getInt(arr, 3);
		System.out.println(Ele);
		Array.set(arr,2,88);
		int modifiedElement=arr[0];
		System.out.println("Modified Element:"+modifiedElement);
	}
}
