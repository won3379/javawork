package kr.or.iei.model;

public class User1 {
	
	private String id;
	private String pwd;
	private String name;
	
	public User1() {}
	
	public User1(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	//set+필드 이름 ()-입력,
	//, get + 필드이름 ()함수 -출력
	public void setId(String id) {
		this.id=id;	
	}
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd=pwd;	
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setName(String name) {	
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	
}


