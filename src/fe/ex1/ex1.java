package fe.nine;
public class ex1 {
	public static void main(String[] args) {
		StrRev s = StrRev("CharSequence interface is in the java.lang package.");
		int start = StrRev.random(s.length()-1);
		int end = StrRev.random(s.length()-1);
		System.out.print(s.subSequence(end, start));
		
	}
}
class StrRev inplements CharSequence{
	private String s;
	private static int far=0;
	public StrRev(String s) {this.s = s;}
	private int fromEnd(int i) {return s.length() -1 -i;}
	public char charAt(int i) {
		
	}
}
