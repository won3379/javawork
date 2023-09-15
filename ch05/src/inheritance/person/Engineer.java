package inheritance.person;

//Engineer 가 Person을 상속받음 
public class Engineer extends Person {
	int companyId;
	
	//매개변수 있는 생성자를 상속받을 때 super()사용
	public Engineer(String name, int age, int companyId) {
		super(name,age);//부모클래스 상속
		this.companyId=companyId;//자식 클래스 필드초기화
	}
	public int getCompanyId() {
		return companyId;
	}
}
