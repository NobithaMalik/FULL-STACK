
package Day3;
import java.util.Scanner;
public class StrToInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		sc.close();
	}

}

