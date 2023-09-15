package data;

public class FloatDoubleType {

	public static void main(String[] args) {
		// 실수 자료형 float와 double 의 차이 정밀도 차이
		
		float fNum =1.234567F; //소수점이하6자리까지 출력 2^7 -128~127
		double dNum =1.2345674344223233; //소수점이하16자리까지 출력
		
		System.out.println(fNum);
		System.out.println(dNum);

	}

}
