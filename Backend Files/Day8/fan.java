
package Day8;
import java.util.Scanner;
class fan2 {
	int FanWings; 
	String FanBrand;
	String FanColor;
	public void Display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Fan Brand");
		FanBrand=sc.nextLine();
		System.out.println("Enter Your Fan Color");
		FanColor=sc.nextLine();
		System.out.println("Enter No.of FanWings");
		FanWings=sc.nextInt();
		System.out.println("Your fan is "+FanBrand+" Which Consists of "+FanWings+" Wings and its color is "+FanColor+".");
		sc.close();
	}
	
}

public class fan{
	public static void main(String[] args) {
		fan2 f=new fan2();
		f.Display();	
	}
}