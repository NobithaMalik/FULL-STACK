package Day2;
import java.util.Scanner;
public class Second {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("Eligible to vote");
			}
			else if(age>18)
			{
				System.out.println("Also Eligible to vote");
				
			}
			else {
				System.out.println("NOT Eligible to vote");
			}
			sc.close();
	}
}
