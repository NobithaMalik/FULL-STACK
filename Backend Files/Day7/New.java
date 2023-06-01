package Day7;
public class New {
	public static void main(String[] args) {
		String s1=new String("CBIT");
		String s2=new String("CBIT");
		if(s1==s2)
		{
			System.out.println("References are Equal");
		}
		else
			System.out.println("References are Not Equal");
		if(s1.equals(s2))
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are Not Equal");
		
	}
}
