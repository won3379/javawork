package student;

public class Student {
	static int serialNum = 1000; //클래스 변수
	int id;		//인스턴스 변수(필드)
	String name;//인스턴스 변수(필드)
	
	//입력
	public void setId(int id) {
		this.id = id;
	}
	//출력
	public int getId() {
		return id;
	}
	public int getSerialNum() {
		return serialNum;
		
	}
}
