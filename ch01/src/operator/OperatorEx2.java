package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 비교 연산자 - > , < , == <  != , >= , <=
		System.out.println(4 < 5); //true
		// 결과는 boolean 자료형. 
		System.out.println(4 > 5); //false
		System.out.println(4 == 5); //true 같다 
		System.out.println(4 != 5); //true 같지 않다 

		// 변수를 사용하여 비교 연산하기
		int n1 = 4,n2 = 5; //변수2개를 연속하여 선언
		System.out.println(n1 > n2);// false 
		System.out.println(n1 < n2);// true 
		System.out.println(n1 != n2);// true 
		System.out.println(n1 == n2); // false
		System.out.println("=============== ==");
		
		//손흥민 미혼
		boolean ismerried = false;
		System.out.println(ismerried);
		// 조건 연산자 : (비교값) ? 참인값: 거짓인값
		String result = (ismerried ==true) ? "기혼입니다." : "미혼입니다."; 
		// 같다라는 의미는 ==비교연산자이고 = 대입연산자	
		System.out.println("손흥민 선수는" + result);
	
	}

}
