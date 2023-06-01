package Day11;
interface AboutMe{
	public void Name();
	public void age();
}
class More implements AboutMe{
	public void Name() {
		System.out.println("My Name is Malik");
	}
	public void age() {
		System.out.println("My age is 20");
	}
	
}
public class Interfaces {
	public static void main(String[] args) {
		More m=new More();
		m.Name();
		m.age();
	}
}
