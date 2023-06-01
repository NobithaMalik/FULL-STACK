package Day5;
import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		
	sc.close();
	}
}
