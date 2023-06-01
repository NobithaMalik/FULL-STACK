package Day9;
public class MultipleInheritance{
	class A{
		String name;
		public void msg()
		{
			System.out.println("CBIT");
		}
	}
	class B extends A{
		public void msg(int a) {
			a=20;
			System.out.println("id is "+a);
		}
	}
	class C extends B{
		public void msg(float k) {
			k=30;
		}
	}
}