package Day10;
abstract class jeep{

	//this is the abstract method
	abstract void  display();
	public void display1()
	{
		System.out.println("THis is the first car");
	}
}
abstract class wagons extends jeep{
	
	}
class malik extends wagons{
	private int age;
	private String name;
	private float rating;
	
	//first constructor object wg
 public	malik(int age,String name){
		 age=this.age;
		 name=this.name;
	 }
	public void display2()
	{
		System.out.println(age+name);
	}
	 
	//second constructor object wg1
	public malik(int myage,float rating){
		 age=myage;
		 rating=this.rating;
	 }
	public void display3()
	{
		System.out.println(age+rating);
	}
	
	//abstract methods with different parameters
	public void display()
	{
		System.out.println("This is the swift class");
	}
	public void display(int a)
	{
		System.out.println("This is the swift class "+a);
	}
	
}
public class Abstraction {
	public static void main(String args[])
	{
		malik wg=new malik(20,"saleem");
		malik wg1=new malik(20,20.3f);
		wg.display();
		wg.display(20);
		wg.display1();
		wg.display2();
		wg1.display3();
	
	}

}

