package Day5;
import java.util.Scanner;
public class ArrayMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		System.out.println("Enter " +(n*n)+" Elements:");
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		sc.close();
	  }
}