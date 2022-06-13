package fe.seven;

public class Seven {
	public static int AGE = 12;
	public static void main(String[] args) {
		Seven.AGE +=6;
		System.out.print("You are "+AGE+" years old.");
	}
	static {
		AGE = 20;
	}
}
