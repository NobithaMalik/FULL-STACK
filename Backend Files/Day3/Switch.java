package Day3;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition");
		System.out.println("Substraction");
		System.out.println("Multiplication");
		System.out.println("division");
		int n=sc.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println("1.Addition of a+b:"+(a+b));
			break;
		case 2:
			System.out.println("2.Substraction of a-b:"+(a-b));
			break;
		case 3:
			System.out.println("3.Multiplication of a*b:"+(a*b));
			break;
		case 4:
			System.out.println("4.Division of a/b:"+(a/b));
			break;
		
		default:System.out.println("Not Found");	
	}
		sc.close();
		
	}
	
}
