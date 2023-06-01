package Day5;
import java.util.Scanner;
public class ArrayIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Key value:");
		int key=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				System.out.println("Index = "+i);
				System.out.println("Element is found");
				break;
				
			}
			else {
				flag=0;
			}
		}
		if(flag==0)
			
		{
			System.out.println("Element is not Found");
		}
		sc.close();
	}
	

}
