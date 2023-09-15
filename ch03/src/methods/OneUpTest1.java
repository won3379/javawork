package methods;

public class OneUpTest1 {
	
	//1 증가하는 함수 정의
	//지역변수의 생명주기(scope)
	//- 함수나 if문등등제어문의 블럭안에서 생성되고,호출된 뒤에 소멸함  
	public static int oneUp() {
		int x =1; //지역 변수
		x++; //x+=1 c나 자바는 x++로 쓰지만 다른언어는 이렇게 쓰기도 함.
		return x;
	}

	
	public static void main(String[] args) {
		System.out.println(oneUp()); //2출력
		System.out.println(oneUp()); //2출력
	//	int x=10;
		///System.err.println(x); //oneUp()의 x는 소멸된변수임.
	}
}
