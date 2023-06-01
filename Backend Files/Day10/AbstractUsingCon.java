package Day10;
abstract class car
{
	 
	abstract void drive();
		public void playMusic() {
			System.out.println("This is First Car");
		}
	}
abstract class wagon extends car
{
	
}
		class swift extends wagon{
			private int age;
			private String name;
			private float rating;
			public swift(int age,String name){
				age=this.age;
				name=this.name;
			}
			
			public swift(int Myage,float rating){
				Myage=this.age;
				rating=this.rating;
			}
			
			
			public void drive() {
				System.out.println("This is Swift Car");
			}
			public void drive(int a)
			{
				System.out.println("This is Swift Car "+a);
			}
		}
public class AbstractUsingCon {
	public static void main(String[] args) {
		swift s=new swift(20,"Malik");
		swift s1=new swift(20,4.5f);
		
		s.drive(20);
		s.playMusic();
	}

}
