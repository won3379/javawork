package singleton;

public class Student {
		
	
	private static int studentNum =100;
	private int astudentNum;
	
	public Student() {
		studentNum++;
		astudentNum= studentNum;
		
		
	public int getastudentNum() {
		return astudentNum;
				
	}
	}
}
