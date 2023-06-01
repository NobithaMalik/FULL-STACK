package Day8;
import java.util.Scanner;
public class ArgNoRet {
	public void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArgNoRet arn=new ArgNoRet(); 
		arn.sum(a, b);
		sc.close();
	}

}
