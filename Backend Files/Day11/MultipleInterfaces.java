package Day11;
interface A{
	public void Name1();
}
interface B{
	public void Name2();
}
interface C{
	public void Name3();
}
class Demo implements A,B,C{
	public void Name1() {
		System.out.println("My Name is Malik");
	}
	public void Name2() {
		System.out.println("He is Saleem");
	}
	public void Name3() {
		System.out.println("He is Moulali");
	}
	
}
public class MultipleInterfaces {
	public static void main(String[] args) {
		Demo m=new Demo();
		m.Name1();
		m.Name2();
		m.Name3();
	}
}
