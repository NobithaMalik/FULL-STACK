package Day10;
class parent{
	parent()
	{
		System.out.println("This is 0 paramterized parent class");
	}
	parent(int x) {
		this();
		System.out.println("This is 1 parameterized parent class "+x);
	}
}
class child extends parent
{
	child()
	{
		System.out.println("This is 0 parameterized chlid class");
	}
	child(int x,int y)
	{
		super(0);
		System.out.println("This is 2 parameterized child class "+x+" "+y);
		
	}
}
	class Grandchild extends child
	{
		 Grandchild()
		{
			System.out.println("This is 0 parameterized grandchlid class");
		}
		Grandchild(int x,int y,int z)
		{
			super(2,3);
			System.out.println("This is 3 parameterized child class "+x+" "+y+" "+z);
			
		}
	}
		
public class Polymorphism {
	public static void main(String[] args) {
		Grandchild gf=new Grandchild(10,20,30); 
		
	}
}
