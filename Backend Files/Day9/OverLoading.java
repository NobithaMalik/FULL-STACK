package Day9;

public class OverLoading {
	private String name;
	private int age;
	private float marks;
	public OverLoading(String MyName,int MyAge) {
		name=MyName;
		age=MyAge;
	}
	public OverLoading(String MyName,float MyMarks)
	{
		name=MyName;
		marks=MyMarks;
	}
	public static void main(String[] args) {
		OverLoading o1=new OverLoading("Malik",21);
		OverLoading o2=new OverLoading("Saleem",25.0f);
		System.out.println(o1.name);
		System.out.println(o2.name);
		
	}
	
		
	}
