package Day14;
class Example extends Thread{
	public void run() {
		System.out.println("This is a Example Thread");
	}
}
public class thread{
	public static void main(String[] args) {
		Example e=new Example();
		e.start();
		System.out.println("This is Main Thread");
		thread t=new thread();
		t.run();
	}
	public void run() {
		System.out.println("This is Outside Thread");
	}
}

