package objectarray.dogs;

public class Dog {
	private String name;
	private String type;

	//생성자
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	//get()함수
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
}
