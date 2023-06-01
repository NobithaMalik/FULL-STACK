package Day8;

public class StudentOb {
	private String name;
	private int age;
	private String Department;
		public StudentOb(String StudentName,int StudentAge,String StudentDepartment)
		{
			name=StudentName;
			age=StudentAge;
			Department=StudentDepartment;
		}
		//get Methods
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getDepartment() {
			return Department;
		}
	public static void main(String[] args) {
		StudentOb Ob1=new StudentOb("Malik",19,"CSE");
		StudentOb Ob2=new StudentOb("Saleem",20,"CSE");
		System.out.println("Student 1:");
		System.out.println("Name:"+Ob1.getName());
		System.out.println("Age:"+Ob1.getAge());
		System.out.println("Department:"+Ob1.getDepartment());
		System.out.println();
		System.out.println("Student 2:");
		System.out.println("Name:"+Ob2.getName());
		System.out.println("Age:"+Ob2.getAge());
		System.out.println("Department:"+Ob2.getDepartment());
		
	}
}
