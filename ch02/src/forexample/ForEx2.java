package forexample;

public class ForEx2 {

	public static void main(String[] args) {
		// 1부터10까지 더하기
		//변수 i, total
		int i =0;//반복 변수
		int total =0; //합계
		for(i=1; i<=10; i++) {//초기값 종료값,증감값
			total += i; //total =total+i = total+ =i
			System.out.println("i="+i+",total="+total);
		}
		System.out.println("합계"+total);
		/*  1=0+1
		 *  3=1+2
		 *  6 3+3
		 * ......
		 * 
		 */
		
	}

}
