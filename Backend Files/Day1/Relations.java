package Day1;

public class Relations {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		String res=(a<b)?"a+b":"a-b";
		System.out.println("a == b=>"+(a == b));
		System.out.println("a != b=>"+(a != b));
		System.out.println("a > b=>"+(a > b));
		System.out.println("a < b=>"+(a < b));
		System.out.println("b >= a=>"+(b >= a));
		System.out.println("b <= a=>"+(b<= a));
		System.out.println("a<20 && b<30=>"+(a<20 && b<30));
		System.out.println("a<20 || b<30=>"+(a<20 || b<30));
		System.out.println("a&b=>"+(a&b));
		System.out.println("a|b=>"+(a|b));
		System.out.println("a^b=>"+(a^b));
		System.out.println(res);
	
		
		
		
	}

}
