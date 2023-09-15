package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술 연산자 (상수)  -+*/% %(나머지)
		System.out.println(4+8);//12
		System.out.println(4-8);//-4
		System.out.println(4*8);//32
		System.out.println(4/(double)8);//0.5 형변환(type conversion)
		System.out.println(4%8); //나머지 4.
		//홀수, 짝수 판별 
		System.out.println(4%2);
		// 산술 연산자(변수 사용)
		// 계산의 결과는 기본이 정수형
		// 자바의 기본형 - int, double 
		int a = 4;
		int b = 8;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/(double)b);
		//점수의 합계, 평균
		int korScore = 90 ,mathScore=85, sumScore; //합계 변수 선언
		double avgScore; //평균 = 총점/개수 
		sumScore = korScore+mathScore; //합계 계산
		avgScore = (double)sumScore / 2;
		System.out.println("총점은"  + sumScore);
		System.out.println("평균은"  + avgScore);
	}

}
