package ifexample;

public class LimitspeedTest {

	public static void main(String[] args) {
		// if문
		//제한속도(limit speed) 50이면 "제한 속도 위반"
				/* if(비교문) { //비교문이 true 면 실행문 작동
			실행문1;
		} else{ //false이면 실행문2 작동 
		 실행문2;
*/      
		int limitSpeed = 45;
		/*if(limitSpeed>=50) {
			System.out.println("제한 속도 위반 과태료10만원부과대상");
			*/
		//if ~else 구문
		if(limitSpeed >=50) {
			System.out.println("제한 속도 위반 과태료10만원부과대상");
		}else { //limitSpeed <50 생략
			System.out.println("안전 속도 준수!");
		}
		
		
			System.out.println("시속"+ limitSpeed + "km입니다.");
		}
	}


