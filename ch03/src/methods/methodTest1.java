package methods;

public class methodTest1 {
	
	//변수는 선언과 사용 이라함은 , 함수는 정의와 호출이라 한다.
			// 함수 정의(선언)과 호출(사용)
	
	public static void main(String[] args) {
		sayhello();
		sayhello("파이썬");
		sayhello("우영우");
	}
	
	//sayHello() 이름의 함수를 정의
	//void -반환값이 없음(비어 있다)
	public static void sayhello() {
		System.out.println("ㅎㅇ");
	}
	
	//매개변수(parameter)가 있는 함수를 정의
	public static void sayhello(String name) {
		System.out.println("ㅎㅇ"+name);
	}

}
