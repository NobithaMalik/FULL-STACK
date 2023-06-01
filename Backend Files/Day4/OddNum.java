package Day4;
import java.util.Scanner;
public class OddNum {
	public int Show() {
		System.out.println("Java");
		int age=20;
		return age;
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i+=2)
	 {
		 System.out.println(i);
	 }
	 sc.close();
	 
	}
}
