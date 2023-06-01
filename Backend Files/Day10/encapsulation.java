package Day10;
class encap{
	private int age=20;
	public int getage()	{
		return age;
	}
	public void age2() {
		System.out.println(age);
	}
	public int setage(int newage) {
		age=newage;
		return age;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		encap ob=new encap();
		ob.age2();
		System.out.println(ob.getage());
		System.out.println(ob.setage(18));
		
	}

}
