/*package Day5;
import java.util.Arrays;
public class BinarySearchArray{
	public static void main(String[] args) {
		int arr[]= {10,49,68,97};
		int key=49;
		System.out.println("key at index "+Arrays.binarySearch(arr,key));
	}
}*/
package Day5;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,8,22,89,52,19,4};
		int key=sc.nextInt();
		System.out.println("key at index "+Arrays.binarySearch(arr,key));
		sc.close();
	}
}