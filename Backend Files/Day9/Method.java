package Day9;
import java.util.Scanner;
public class Method {
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Method ob=new Method();
	int a=sc.nextInt();
	int b=sc.nextInt();
	ob.sum(a,b);
	System.out.println("First Method Successfully");
	int c=sc.nextInt();
	int d=sc.nextInt();
	ob.sum(c,d);
	System.out.println("Second Method Sucessfully");
	sc.close();
}
}

