package Day8;
import java.util.Scanner;
//Parameters With Return Values
public class ArgRet{
	public int sum (int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArgRet ar=new ArgRet();
		int s=ar.sum(a, b);
		System.out.println(s);
		sc.close();
	}
}
