package Day7;

public class Immutable {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Before Modification:"+sb);
		sb.append("World");
		System.out.println("After Append:"+sb);
	}
}
