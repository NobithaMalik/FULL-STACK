package Day9;
class A{
	static int x=10;
	static int y=20;
	}
class SingleInheritance extends A{
	public static void main(String[] args) {
		int z=x+y;
		System.out.println(z);
	}
	
}