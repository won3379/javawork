package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 논리 연산자 
		// && - 엠퍼샌드 두 항이 모두 참인 경우에 true,하나라도 틀릴 시 false -논리곱
		// || - bar 2개 :두 항 중 하나만 참이어도 참(true)   or 조건 -논리합
		// ! - 항이 참이면 거짓, 거짓이면 참 
		System.out.println((4<5) && (10 == 11)); //false
		System.out.println((4<5) || (10 == 11)); //true
		System.out.println(!(10==11)); //true-논리 부정
	}

}
